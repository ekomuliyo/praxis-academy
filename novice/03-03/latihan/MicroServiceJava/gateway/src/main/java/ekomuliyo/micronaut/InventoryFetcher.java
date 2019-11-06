package ekomuliyo.micronaut;

import io.reactivex.Maybe;

/**
 * InventoryFetcher
 */
public interface InventoryFetcher {

    Maybe<Integer> inventory(String isbn);
    
}