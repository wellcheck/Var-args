package exemplovarargs;

public class CorreioEletronico {

	//Metodo para enviar varios e-mails
	
	// Com os 3 ponto depois da strint o argumento fica variavel, ele recebe de 0 até....
	public void enviarEmail(String... emails) {
		//Percorrer e-mails recebidos
		for(String email : emails) {
			System.out.println("Email enviado para: " + email);
		}
	}
}
