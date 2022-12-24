package quick_java.mpp_final;

@FunctionalInterface
public interface CustomKPredicate<T, R> {
	R test(T t);
}
