package quick_java_mpp.mpp_final;

@FunctionalInterface
public interface KQuadFunction<S, T, U, V, R> {
	R apply(S s, T t, U u, V v);
}
