package model.exception;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	// permitir que possa instanciar a exce��o personalizada
	public DomainException(String msg) {
		super(msg);
	}
	

}
