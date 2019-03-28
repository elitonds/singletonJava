package exercicio.singleton;

public enum OptionEnum {
	SAIR(0),ADICIONAR(1), REMOVER(2), RELATORIO(3),BUSCAR(4), INICIO(10);
	
	private int codigo;
	
	private OptionEnum(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
}
