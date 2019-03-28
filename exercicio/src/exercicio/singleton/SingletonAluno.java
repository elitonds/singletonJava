package exercicio.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class SingletonAluno {

	private static SingletonAluno uniqueInstance;
	private List<Aluno> alunos;
	private Random ramdom = new Random();

	private SingletonAluno() {
		this.alunos = new ArrayList<Aluno>();
	}

	public static synchronized SingletonAluno getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new SingletonAluno();
		return uniqueInstance;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public void salvar(Aluno aluno) {
		aluno.setId(new Long(this.ramdom.nextInt(1000)));
		this.alunos.add(aluno);
	}

	public List<Aluno> buscarPorNome(String nome) {
		List<Aluno> search = alunos.stream().filter(list -> list.getNome().toLowerCase().contains(nome.toLowerCase()))
				.collect(Collectors.toList());
		return search;
	}

	public void remover(Long id) {
		this.alunos.removeIf(a -> a.getId().equals(id));
	}
}
