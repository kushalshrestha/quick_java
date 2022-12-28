package quick_java_mpp.mpp_final;

@FunctionalInterface
public interface CustomKPredicate<T, R> {
	R test(T t);
}
