import javax.swing.JOptionPane;

public class Sopa_Letras {

	
	public static void pasarHorizontal(String sopa[][],String palabra, int f, int c) {
		for(int i=0; i<palabra.length(); i++) {
			sopa[f][c+i]=""+palabra.charAt(i); //Moverse de manera Horizontal
		}
	}
	public static void pasarVertical(String sopa[][],String palabra, int f, int c) {
		for(int i=0; i<palabra.length(); i++) {
			sopa[f+1][c]=""+palabra.charAt(i); //Moverse de manera Vertical
		}
	}
	
	public static void VisualisarSopa(String sopa[][]) {
		for(int i=0; i<sopa.length;i++) {
		for(int j=0; j<sopa.length;j++) { //Generar pocision
			System.out.println(""+ sopa[i][j]);
		}
				System.out.println(""); //Visualizar Sopa
		}
	}
	public static void diagonal(String sopa[][], String palabra, int f, int c) {
		for(int i=0; i<palabra.length();i++) {
			sopa[f+1][c+i]=""+palabra.charAt(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filas=16;
		int columnas=16;
		String sopa[][]= new String[filas][columnas];
		
		int fiU,CoU;
		String dato;
		String palabra=JOptionPane.showInputDialog("Ingrese la Palabra");
		
		dato=JOptionPane.showInputDialog("Ingrese la fila");
		fiU=Integer.parseInt(dato);
		
		dato=JOptionPane.showInputDialog("Ingrese la Columna");
		CoU=Integer.parseInt(dato);
		
		diagonal(sopa,palabra,fiU,CoU);
		VisualisarSopa(sopa);
	    pasarHorizontal(sopa,palabra,fiU,CoU);
	    VisualisarSopa(sopa);
	    pasarVertical(sopa,palabra,fiU,CoU);
		VisualisarSopa(sopa);
	}

}
