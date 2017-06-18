package Interfaces;

public interface IHuman {
	default boolean hasChildren() {
		return false;
	};
	int childrenNumber();
}
