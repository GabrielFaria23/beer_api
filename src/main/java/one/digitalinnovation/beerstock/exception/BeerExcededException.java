package one.digitalinnovation.beerstock.exception;

public class BeerExcededException extends Throwable {
    public BeerExcededException(Long id, int quantityToIncrement) {
        super(String.format("Beers with %s ID to increment informed exceeds the max stock capacity: %s", id, quantityToIncrement));
    }
}
