package br.com.spring.cloud.estudos;

public class Greeting {
	
	private final long id;
	private final String content;
	
	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	
	
	
	
	
	
	
}
