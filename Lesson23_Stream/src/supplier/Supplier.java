package supplier;
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
