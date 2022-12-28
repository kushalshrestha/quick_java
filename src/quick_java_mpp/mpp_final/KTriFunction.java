package quick_java_mpp.mpp_final;

@FunctionalInterface
public interface KTriFunction<S, T, U, R> {
	R apply(S s, T t, U u);
}
