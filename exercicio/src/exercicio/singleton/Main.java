package exercicio.singleton;

import java.time.LocalDateTime;

public class Main {
	
	public static void main(String[]args) {
		/*TODO Fazer toda a lógica com scanner */
//		int option = OptionEnum.INICIO.getCodigo();
//		
//		while(option != OptionEnum.SAIR.getCodigo()) {
//			
//		}
		
		Aluno aluno = new Aluno("Eliton", LocalDateTime.of(1991, 8, 11, 1, 30), "BCC", "primeiro");
		SingletonAluno.getInstance().salvar(aluno);
		aluno = new Aluno("Elitons", LocalDateTime.of(1991, 8, 11, 1, 30), "BCC", "primeiro");
		SingletonAluno.getInstance().salvar(aluno);
		aluno = new Aluno("Priscila", LocalDateTime.of(1991, 8, 11, 1, 30), "BCC", "primeiro");
		SingletonAluno.getInstance().salvar(aluno);
		aluno = new Aluno("Franklin", LocalDateTime.of(1991, 8, 11, 1, 30), "BCC", "primeiro");
		SingletonAluno.getInstance().salvar(aluno);
		aluno = new Aluno("Fagler", LocalDateTime.of(1991, 8, 11, 1, 30), "BCC", "primeiro");
		SingletonAluno.getInstance().salvar(aluno);
		SingletonAluno.getInstance().remover(aluno.getId());
		
		System.out.println("Lista Geral");
		Relatorio.gerarRelatorio();
		System.out.println("Lista com busca");
		Relatorio.gerarRelatorio("Eliton");
	}
}
