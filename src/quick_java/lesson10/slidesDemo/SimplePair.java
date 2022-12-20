package quick_java.lesson10.slidesDemo;

public class SimplePair<K, V> {
	private K keyA;
	private V value;

	public SimplePair(K key, V value) {
		this.keyA = key;
		this.value = value;
	}

	public K getKey() {
		return keyA;
	};

	public V getValue() {
		return value;
	};

}
