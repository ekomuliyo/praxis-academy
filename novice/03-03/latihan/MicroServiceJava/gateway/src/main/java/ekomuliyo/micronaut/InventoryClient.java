package ekomuliyo.micronaut;

import io.micronaut.context.annotation.Requires;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Maybe;

/**
 * InventoryClient
 */

@Client("inventory")
@Requires
public interface InventoryClient extends InventoryFetcher{
    @Override
    @Get("/api/inventory/{isbn}")
    Maybe<Integer> inventory(String isb);
}