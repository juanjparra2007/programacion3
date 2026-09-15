import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("1. Punto 17");
        System.out.println("2. Punto 18");
        System.out.println("3. Punto 19");
        System.out.println("4. Punto 20");
        System.out.println("5. Punto 21");
        System.out.println("6. Punto 22");
        System.out.println("7. Punto 24");

        System.out.print("Ingrese el número del punto que quiere ejecutar: ");
        opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                int[][] a = {
                        { 5, 8, 6 },
                        { 1, 3, 2 },
                        { 4, 7, 9 }
                };

                for (int f = 0; f < a.length; f++) {
                    for (int c = 0; c < a[f].length; c++) {
                        System.out.println("a[" + f + "][" + c + "] = " + a[f][c]);
                    }
                }

                for (int f = 0; f < a.length; f++) {
                    int sumaFila = 0;
                    for (int c = 0; c < a[f].length; c++) {
                        sumaFila += a[f][c];
                    }
                    System.out.println("Suma de la fila " + f + ": " + sumaFila);
                }

                for (int c = 0; c < a[0].length; c++) {
                    int sumaColumna = 0;
                    for (int f = 0; f < a.length; f++) {
                        sumaColumna += a[f][c];
                    }
                    System.out.println("Suma de la columna " + c + ": " + sumaColumna);
                }

                String cad = "";
                for (int f = 0; f < a.length; f++) {
                    for (int c = 0; c < a[f].length; c++) {
                        cad += "|" + a[f][c] + "|";
                    }
                    cad += "\n";
                }
                System.out.println(cad);
                break;

            case 2:
                int[][] tablaMultipl = new int[10][10];

                for (int f = 0; f < tablaMultipl.length; f++) {
                    for (int c = 0; c < tablaMultipl[f].length; c++) {
                        tablaMultipl[f][c] = (f + 1) * (c + 1);
                    }
                }

                String cad18 = "";
                for (int f = 0; f < tablaMultipl.length; f++) {
                    for (int c = 0; c < tablaMultipl[f].length; c++) {
                        cad18 += "|" + tablaMultipl[f][c] + "|";
                    }
                    cad18 += "\n";
                }
                System.out.println(cad18);
                break;

            case 3:
                System.out.print("Ingrese número de filas: ");
                int cantFils = sc.nextInt();
                System.out.print("Ingrese número de columnas: ");
                int cantColm = sc.nextInt();

                int[][] a19 = new int[cantFils][cantColm];

                for (int f = 0; f < a19.length; f++) {
                    for (int c = 0; c < a19[f].length; c++) {
                        if (f == c) {
                            a19[f][c] = 1;
                        } else {
                            a19[f][c] = 0;
                        }
                    }
                }

                String cad19 = "";
                for (int f = 0; f < a19.length; f++) {
                    for (int c = 0; c < a19[f].length; c++) {
                        cad19 += "|" + a19[f][c] + "|";
                    }
                    cad19 += "\n";
                }
                System.out.println(cad19);
                break;

            case 4:
                int[][] aVeinte = new int[10][10];

                for (int f = 0; f < aVeinte.length; f++) {
                    for (int c = 0; c < aVeinte[f].length; c++) {
                        if (f <= c) {
                            aVeinte[f][c] = 0;
                        } else {
                            aVeinte[f][c] = 1;
                        }
                    }
                }

                String cad20 = "";
                for (int f = 0; f < aVeinte.length; f++) {
                    for (int c = 0; c < aVeinte[f].length; c++) {
                        cad20 += "|" + aVeinte[f][c] + "|";
                    }
                    cad20 += "\n";
                }
                System.out.println(cad20);
                break;

            case 5:
                int tamanoM = 5;
                int[][] matrizPares = new int[tamanoM][tamanoM];
                int[] vectorSumasPares = new int[matrizPares.length];

                for (int f = 0; f < matrizPares.length; f++) {
                    for (int c = 0; c < matrizPares[f].length; c++) {
                        matrizPares[f][c] = (int) (Math.random() * 20 + 1);
                    }
                }

                for (int f = 0; f < matrizPares.length; f++) {
                    for (int c = 0; c < matrizPares[f].length; c++) {
                        if (matrizPares[f][c] % 2 == 0) {
                            vectorSumasPares[f] += matrizPares[f][c];
                        }
                    }
                }

                String cad21 = "";
                for (int f = 0; f < matrizPares.length; f++) {
                    for (int c = 0; c < matrizPares[f].length; c++) {
                        cad21 += "|" + matrizPares[f][c] + "|";
                    }
                    cad21 += "\n";
                }
                System.out.println(cad21);

                System.out.println("Vector B:");
                for (int k = 0; k < vectorSumasPares.length; k++) {
                    System.out.println("B[" + k + "] = " + vectorSumasPares[k]);
                }
                break;

            case 6:
                System.out.print("Ingrese el tamaño de filas: ");
                int numFilas = sc.nextInt();

                System.out.print("Ingrese el tamaño de columnas: ");
                int numCols = sc.nextInt();

                int[][] matriz = new int[numFilas][numCols];

                for (int f = 0; f < matriz.length; f++) {
                    for (int c = 0; c < matriz[f].length; c++) {
                        matriz[f][c] = (int) (Math.random() * 100 + 1);
                    }
                }

                String cad22 = "";
                for (int f = 0; f < matriz.length; f++) {
                    for (int c = 0; c < matriz[f].length; c++) {
                        cad22 += "|" + matriz[f][c] + "|";
                    }
                    cad22 += "\n";
                }
                System.out.println(cad22);

                int valorMayor = matriz[0][0];
                int valorMenor = matriz[0][0];

                int posFilaMayor = 0;
                int posColMayor = 0;
                int posFilaMenor = 0;
                int posColMenor = 0;

                for (int f = 0; f < matriz.length; f++) {
                    for (int c = 0; c < matriz[f].length; c++) {

                        if (matriz[f][c] > valorMayor) {
                            valorMayor = matriz[f][c];
                            posFilaMayor = f;
                            posColMayor = c;
                        }

                        if (matriz[f][c] < valorMenor) {
                            valorMenor = matriz[f][c];
                            posFilaMenor = f;
                            posColMenor = c;
                        }
                    }
                }

                System.out.println("Mayor = " + valorMayor);
                System.out.println("Posicion = [" + posFilaMayor + "][" + posColMayor + "]");

                System.out.println("Menor = " + valorMenor);
                System.out.println("Posicion = [" + posFilaMenor + "][" + posColMenor + "]");
                break;

            case 7:
                int[][] produccion = new int[4][12];

                for (int f = 0; f < produccion.length; f++) {
                    for (int c = 0; c < produccion[f].length; c++) {
                        produccion[f][c] = (int) (Math.random() * 90 + 10);
                    }
                }

                String cad24 = "";
                for (int f = 0; f < produccion.length; f++) {
                    for (int c = 0; c < produccion[f].length; c++) {
                        cad24 += "|" + produccion[f][c] + "|";
                    }
                    cad24 += "\n";
                }
                System.out.println("Matriz de Producción:");
                System.out.println(cad24);

                int sumaToneladasTotales = 0;
                for (int f = 0; f < produccion.length; f++) {
                    for (int c = 0; c < produccion[f].length; c++) {
                        sumaToneladasTotales += produccion[f][c];
                    }
                }

                double promedioAnual = (double) sumaToneladasTotales / 48;

                int contadorMesesSuperiores = 0;
                int contadorMesesInferiores = 0;

                int maximoProduccionMes = 0;
                int minimoProduccionMes = 0;

                int mesConMayorProduccion = 1;
                int mesConMenorProduccion = 1;

                for (int c = 0; c < 12; c++) {
                    int acumuladoMes = 0;

                    for (int f = 0; f < produccion.length; f++) {
                        acumuladoMes += produccion[f][c];
                    }

                    if (acumuladoMes > promedioAnual) {
                        contadorMesesSuperiores++;
                    }

                    if (acumuladoMes < promedioAnual) {
                        contadorMesesInferiores++;
                    }

                    if (c == 0 || acumuladoMes > maximoProduccionMes) {
                        maximoProduccionMes = acumuladoMes;
                        mesConMayorProduccion = c + 1;
                    }

                    if (c == 0 || acumuladoMes < minimoProduccionMes) {
                        minimoProduccionMes = acumuladoMes;
                        mesConMenorProduccion = c + 1;
                    }
                }

                System.out.println("Promedio anual de toneladas: " + promedioAnual);
                System.out.println("Meses con suma mayor al promedio: " + contadorMesesSuperiores);
                System.out.println("Meses con suma menor al promedio: " + contadorMesesInferiores);
                System.out.println("Mes de mayor suma: Mes " + mesConMayorProduccion + " (" + maximoProduccionMes + " toneladas)");
                System.out.println("Mes de menor suma: Mes " + mesConMenorProduccion + " (" + minimoProduccionMes + " toneladas)");
                break;
        }

        sc.close();
    }
}