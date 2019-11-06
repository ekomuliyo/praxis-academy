package ekomuliyo.micronaut;

import javax.inject.Singleton;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.reactivex.Maybe;

/**
 * MockInventoryClient
 */
@Singleton
@Requires(env = Environment.TEST)
 public class MockInventoryClient implements InventoryFetcher{

    @Override
    public Maybe<Integer> inventory(String isbn){
        if (isbn.equals("789797979")) {
            return Maybe.just(2);
        }
        if (isbn.equals("879879879")) {
            return Maybe.just(0);
        }
        return Maybe.empty();
    }
    
}