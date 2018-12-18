package adt.stack.parenthesis;

import java.util.Stack;

/**
 * @author Cláudio Campelo
 * Ver comentários na interface LongestValidParenthesisSubstring.
 *
 */
public class LongestValidParenthesisSubstringImpl implements LongestValidParenthesisSubstring {

    /* (non-Javadoc)
     * @see adt.stack.parenthesis.LongestValidParenthesisSubstring#findLongest(java.lang.String)
     */
    public String findLongest(String parenthesis) {
		Stack<String> pilha = new Stack();
		
		String validaLocal = "";
		String validaGlobal = "";
		
		for(String caractere: parenthesis.split("")) {
			
			if(caractere.equals("(")) { 
				pilha.push(caractere);
				validaLocal += "(";
			}
			else {
				if(pilha.isEmpty()) {
					if(validaLocal.length() >= validaGlobal.length())
						validaGlobal = validaLocal;
					validaLocal = "";
				}else {
					pilha.pop();
					validaLocal += ")";
					if(validaLocal.length() >= validaGlobal.length())
						validaGlobal = validaLocal;
				}
			}
		}
		if(validaLocal.length() >= validaGlobal.length() && pilha.isEmpty())
			validaGlobal = validaLocal;
		
		if(validaGlobal.equals("")) validaGlobal = null;
		
		return validaGlobal;
    }
    
    /*
     * Este é um método utilitário que calcula o "espelho" de uma String.
     * Ou seja, é uma espécie de flip horizontal. Veja os exemplos abaixo
     * para entender como o método deve ser comportar.
     * 
     * A implementação deste método não é obrigatória, porém, é fortemente
     * recomendada, visto que pode ser muito útil para a implementação
     * do findLongest.
     * 
     * Neste método, implemente uma solução baseada em PILHA. 
     * 
     * Exemplo 1:
     * input		   = ((()
     * expected_output = ()))
     * 
     * Exemplo 2:
     * input		   = ()()
     * expected_output = ()()
     * 
     * Exemplo 2:
     * input		   = (((((
     * expected_output = )))))
     */
    private static String parenthesisMirror(String str){
        
    	Stack<String> stack = new Stack<String>();
    	String mirrorStr = ""; 
    	
    	for(String a: str.split("")) 
    		stack.push(a);
    	
    	while(!stack.isEmpty()) {
    		String aux = stack.pop();
    		if(aux.equals("("))
    			mirrorStr += ")";
    		else
    			mirrorStr += "(";
    	}
    	
		return mirrorStr;
    	

    }
    
    
    /*
     * public String findLongest(String parenthesis) {
		Stack<String> pilha = new Stack();
		
		String validaLocal = "";
		String validaGlobal = "";
		
		for(String caractere: parenthesis.split("")) {
			if(caractere.equals("(")) { 
				pilha.push(caractere);
				validaLocal += "(";
			}
			else {
				if(pilha.isEmpty()) {
					if(validaLocal.length() >= validaGlobal.length())
						validaGlobal = validaLocal;
					validaLocal = "";
				}else {
					pilha.pop();
					validaLocal += ")";
				}
			}
		}
		if(validaLocal.length() >= validaGlobal.length() && pilha.isEmpty())
			validaGlobal = validaLocal;
		
		return validaGlobal;
    }
     * 
     */


}
