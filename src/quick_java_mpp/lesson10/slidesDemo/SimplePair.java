package quick_java_mpp.lesson10.slidesDemo;

public class SimplePair<K, V> {
	private final K keyA;
	private final V value;

	public SimplePair(K key, V value) {
		this.keyA = key;
		this.value = value;
	}

	public K getKey() {
		return keyA;
	}

    public V getValue() {
		return value;
	}

}
