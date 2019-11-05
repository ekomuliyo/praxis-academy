package StreamsJavaDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import com.mongodb.MongoTimeoutException;

import org.bson.Document;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import static java.lang.String.format;

/**
 * SubscriberHelper
 */
public class SubscriberHelper {

    public static class ObservableSubscriber<T> implements Subscriber<T> {

        private final List<T> received;
        private final List<Throwable> errors;
        private final CountDownLatch latch;
        private volatile Subscription subscription;
        private volatile boolean completed;

        // masukan semua object final ke dalam construktor
        ObservableSubscriber(){
            this.received = new ArrayList<T>();
            this.errors = new ArrayList<Throwable>();
            this.latch = new CountDownLatch(1);
        }

        @Override
        public void onSubscribe(Subscription s) {
            subscription = s;
        }

        @Override
        public void onNext(final T t) {
            received.add(t);
        }

        @Override
        public void onError(Throwable t) {
            errors.add(t);
            onComplete();
        }

        @Override
        public void onComplete() {
            completed = true;
            latch.countDown();
        }

        public Subscription getSubscription(){
            return subscription;
        }

        public List<T> getReceived(){
            return received;
        }

        public Throwable getError(){
            if(errors.size() > 0){
                return errors.get(0);
            }
            return null;
        }

        public boolean isCompleted(){
            return completed;
        }

        public List<T> get(final long timeout, final TimeUnit unit) throws Throwable {
            return await(timeout, unit).getReceived();
        }

        public ObservableSubscriber<T> await() throws Throwable{
            return await(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        }

        public ObservableSubscriber<T> await(final long timeout, final TimeUnit unit) throws Throwable{
            subscription.request(Integer.MAX_VALUE);
            if(!latch.await(timeout, unit)){
                throw new MongoTimeoutException("Publisher onComplete time out");
            }
            if(!errors.isEmpty()){
                throw errors.get(0);
            }
            return this;
        }
    }

    public static class OperationSubscriber<T> extends ObservableSubscriber<T>{
        
        @Override
        public void onSubscribe(final Subscription s){
            super.onSubscribe(s);
            s.request(Integer.MAX_VALUE);
        }
    }

    public static class PrintSubscriber<T> extends OperationSubscriber<T>{
        private final String message;

        public PrintSubscriber(final String message){
            this.message = message;
        }

        @Override
        public void onComplete(){
            System.out.println(format(message, getReceived()));
            super.onComplete();
        }

    }

    public static class PrintDocumentSubscriber extends OperationSubscriber<Document>{

        @Override
        public void onNext(final Document document){
            super.onNext(document);
            System.out.println(document.toJson());
        }
    }

    private SubscriberHelper(){}
    
}