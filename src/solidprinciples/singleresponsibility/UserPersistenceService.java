package solidprinciples.singleresponsibility;

public class UserPersistenceService {

	private Store store = new Store();

	public void save(User user) {
		store.store(user);
	}

}
