package exercicio.singleton;

import java.util.List;

public class Relatorio {

	public static void gerarRelatorio() {
		imprimir(SingletonAluno.getInstance().getAlunos());
	}
	
	public static void gerarRelatorio(String busca) {
		imprimir(SingletonAluno.getInstance().buscarPorNome(busca));
	}
	
	private static void imprimir(List<Aluno> alunos) {
		StringBuilder sb = new StringBuilder();
		if(alunos.size()>0) {
			alunos.forEach(aluno ->
			sb.append("ID: ").append(aluno.getId())
			.append(" | Nome: ").append(aluno.getNome())
			.append(" | Data Nascimento: ").append(aluno.getDataNascimento().toString())
			.append(" | Curso: ").append(aluno.getCurso())
			.append(" | Período: ").append(aluno.getPeriodo()).append("\n")
		);
		System.out.println(sb.toString());
		}else {
			System.out.println("Não existem dados de alunos ainda");
		}
	}
	
}
