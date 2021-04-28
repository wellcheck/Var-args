package exemplovarargs;

public class TesteCorreioEletronico {

	public static void main(String[] args) {
		CorreioEletronico correio = new CorreioEletronico();
		
	//	String[] emails = new String[2];
	//	emails[0] = "wellington.check@gmail.com";
	//	emails[1] = "wellington.ferreira@imovelweb.com.br";
	//	correio.enviarEmail(emails);

		//Outra maneira de enviar os e-mails de forma mais facil.
	//	correio.enviarEmail(new String[] {"wellington.ferreira@outlook.com", "wellington.silva@yahoo.com.br"});
		
		correio.enviarEmail("wellington.ferreira@outlook.com", "wellington.silva@yahoo.com.br");
	}

}
