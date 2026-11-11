package jogo;
import javax.swing.JOptionPane;
public class fases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jn;
		
		do {
		String nomej1;
		String nomej2;
		String pedra;
		String papel;
		String tesoura;
		String x;
		String y;
		String resposta;
		int pontosj1 = 0, pontosj2 = 0, empate = 0;
		int pontos2f = 0;
		int rodadas [] = new int [3];
	
		nomej1 = JOptionPane.showInputDialog("Bem vindos jogadores! \n coloque seu nome jogador 1");
		nomej2 = JOptionPane.showInputDialog("Bem vindos jogadores! \n coloque seu nome jogador 2");
		
		for (int i = 0; i < 3; i++) {
			
		x = JOptionPane.showInputDialog( nomej1 + ", jogue: pedra, papel, ou tesoura");	
		y = JOptionPane.showInputDialog( nomej2 + ", jogue: pedra, papel, ou tesoura");
	        if (x.equals(y)) {
	        	JOptionPane.showMessageDialog(null, "Empate");
	        	empate+=15;
	        }
			if (x.equals("pedra") && y.equals("tesoura") || (x.equals("papel") && y.equals("pedra")) || (x.equals("tesoura") && y.equals("papel"))) {
				JOptionPane.showMessageDialog(null, nomej1 + " voce venceu! \n + 15 pontos para " + nomej1);
				pontosj1+=15;
			}
			else if (x.equals("tesoura") && y.equals("pedra") || (x.equals("papel") && y.equals("tesoura")) || (x.equals("pedra") && y.equals("papel"))) {
				JOptionPane.showMessageDialog(null, nomej2 + " voce venceu! \n + 15 pontos para " + nomej2);
				pontosj2+=15;
			}
				JOptionPane.showMessageDialog(null, "pontuação dessa rodada: \n" + nomej1 + ":" + pontosj1 + "\n" + nomej2 + ":" + pontosj2);
		}
			    if (pontosj1 < 30 && pontosj2 < 30 || pontosj2 < 30 && pontosj1 <30) {
			    	JOptionPane.showMessageDialog(null, "Vocês falharam! \n o jogo sera encerrado!");
			    	return;
			    }
			    else if (pontosj1 > pontosj2) {
				JOptionPane.showMessageDialog(null, nomej1 + ", você passou para proxima fase");
				}
				else {
					JOptionPane.showMessageDialog(null, nomej2 + ", você passou para poxima fase");
				}
	JOptionPane.showMessageDialog(null, "essa fase exige conhecimento sobre java e git. \n Boa sorte!");
	   resposta = JOptionPane.showInputDialog("como se chama uma variavel que tem cacidade para mais de um número? \nA) array \n"
			    		+ "B) git \nC) switch");
			    if (resposta.equals("a")) {
			    	JOptionPane.showMessageDialog(null, "correto!!");
			    	pontos2f+=15;
			    }
			    else {
	            JOptionPane.showMessageDialog(null, "errado!");
			    }
	   resposta = JOptionPane.showInputDialog("qual nome não pode ser usado em uma variavel? \nA) n1 \nB) @variavel \nC) voto");
			    if (resposta.equals("b")) {
			    	JOptionPane.showMessageDialog(null, "correto!!");
			    	pontos2f+=15;
			    }
			    else { 
	            JOptionPane.showMessageDialog(null, "errado!");
			    }
	    resposta = JOptionPane.showInputDialog("qual comando git adiciona a pasta ao repositório? \nA) git pull \nB) git block \nC) git add .");
			    if (resposta.equals("c")) {
			    	JOptionPane.showMessageDialog(null, "correto!!");
			    	pontos2f+=15;
			    }
			    else { 
	            JOptionPane.showMessageDialog(null, "errado!");
			    }
	    resposta = JOptionPane.showInputDialog(null, "qual a tradução de if? \nA) certo \nB) errado \nC) si");
			    if (resposta.equals("c")) {
			    	JOptionPane.showMessageDialog(null, "correto!!");
			    	pontos2f+=15;
			    }
			    else { 
			    	JOptionPane.showMessageDialog(null, "errado!");
			    }
			    
        resposta = JOptionPane.showInputDialog("o que é uma variavel? \nA) um código \nB) um espaço na memorio reservado para um dado \nC)"
        		+ " um tipo de dado especifico para simbolos");
                if (resposta.equals("b")) {
                	JOptionPane.showMessageDialog(null, "correto");
                }
                else {
                	JOptionPane.showMessageDialog(null, "errado!");
                }
			    	JOptionPane.showMessageDialog(null, "sua pontuação nessa rodada foi: " + pontos2f);
			    	
			    	if (pontos2f <60) {
			    		JOptionPane.showMessageDialog(null, "você perdeu! \n o jogo sera encerrado");
			    		return;
			    	}
			    	else {
			    	    JOptionPane.showMessageDialog(null, "parabens, você passou para a ultima fase!");
			    	}
			    	
	     resposta = JOptionPane.showInputDialog("quem é cronos (mitologia grega)? \nA) pai de Zeus \nB) filho de Poseidon \nC)"
			         		+ " irmão de hermes");
			                 if (resposta.equals("a")) {
			                 	JOptionPane.showMessageDialog(null, "correto");
			                 	pontos2f+=15;
			                 }
			                   else {
			                 	JOptionPane.showMessageDialog(null, "errado!");
			                 }
		  resposta = JOptionPane.showInputDialog("quem era o deus dos mares? \nA) Zeus \nB) Poseidon\nC)"
			                + " apolo");
			                 if (resposta.equals("b")) {
			                     JOptionPane.showMessageDialog(null, "correto");
			                     pontos2f+=15;
			                 }
			                   else {
			                     JOptionPane.showMessageDialog(null, "errado!");
			                 }
		  resposta = JOptionPane.showInputDialog("qual criatura era uma mistura de touro, e homem? \nA) minotauro \nB) centauro \nC)"
			                 + " cerbero");
			                 if (resposta.equals("a")) {
			                     JOptionPane.showMessageDialog(null, "correto");
			                     pontos2f+=15;
			                 }
			                   else {
			                     JOptionPane.showMessageDialog(null, "errado!");
			                 }
		   resposta = JOptionPane.showInputDialog("qual o nome do machado do thor? \nA) mjolnir \nB) excalibur \nC)"
			                 + " stormbreaker");
			                 if (resposta.equals("c")) {
			                     JOptionPane.showMessageDialog(null, "correto");
			                     pontos2f+=15;
			                  }
			                   else {
			                     JOptionPane.showMessageDialog(null, "errado!");
			                  }
		   resposta = JOptionPane.showInputDialog("qual o alter ego do homem aranha? \nA) tony stark \nB) peter parker \nC)"
			                  + " steve rogers");
			                  if (resposta.equals("b")) {
			                      JOptionPane.showMessageDialog(null, "correto");
			                      pontos2f+=15;
			                  }
			                  else {
			                      JOptionPane.showMessageDialog(null, "errado!");
			                  }
			resposta = JOptionPane.showInputDialog("qual o heroi mais famoso de gotam city? \nA) superman \nB) batman \nC)"
			                  + " flash");
			                  if (resposta.equals("b")) {
			                      JOptionPane.showMessageDialog(null, "correto");
			                      pontos2f+=15;
			                  }
			                  else {
			                      JOptionPane.showMessageDialog(null, "errado!");
			                  }
			resposta = JOptionPane.showInputDialog("qual é o planeta de origem do superman? \nA) kripto \nB) marte\nC)"
			                   + " asgard");
			                   if (resposta.equals("a")) {
			                      JOptionPane.showMessageDialog(null, "correto"); 
			                      pontos2f+=15;
			                   }
			                   else {
			                      JOptionPane.showMessageDialog(null, "errado!");
			                   } 
			 resposta = JOptionPane.showInputDialog("qual desses intrumentos é mais comum no rock? \nA) guitarra \nB) flauta \nC)"
			                    + " harpa");
			                    if (resposta.equals("a")) {
			                      JOptionPane.showMessageDialog(null, "correto");
			                      pontos2f+=15;
			                    }
			                    else {
			                       JOptionPane.showMessageDialog(null, "errado!");
			                    } 
			  resposta = JOptionPane.showInputDialog("qual banda é famosa pela musica we will rock you? \nA) queen \nB) beatles \nC)"
			                     + " nirvana");
			                     if (resposta.equals("a")) {
			                       JOptionPane.showMessageDialog(null, "correto");
			                       pontos2f+=15;
			                      }
			                      else {
			                       JOptionPane.showMessageDialog(null, "errado!");
			                      }
			                     resposta = JOptionPane.showInputDialog("qual o antigo vocalista de linkin park? \nA) mike shinoda \nB) linkon stan \nC)"
			                     		+ " chester bennington");
			                             if (resposta.equals("c")) {
			                             	JOptionPane.showMessageDialog(null, "correto");
			                             	pontos2f+=15;
			                             }
			                             else {
			                             	JOptionPane.showMessageDialog(null, "errado!");
			                             }
			                  JOptionPane.showMessageDialog(null, "pontos da fase 2 e 3: " + pontos2f);
			                  if (pontosj1 > pontosj2) {
			                   JOptionPane.showMessageDialog(null, nomej1 + " você fez um total de " + (pontosj1 + pontos2f) + " obrigado por jogar!");
			                  }
			                  else {
			                	  JOptionPane.showMessageDialog(null, nomej2 + " você fez um total de " + (pontosj2 + pontos2f) + " obrigado por jogar!");
			                  }
			                 jn = JOptionPane.showInputDialog("gostaria de jogar novamente?");
		} while (jn.equalsIgnoreCase("sim"));
	}
}