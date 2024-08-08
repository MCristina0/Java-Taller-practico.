public class TallerArreglos {
    public static void main(String[] args) {
        // 1. Declaración e inicialización de un arreglo
        int[] numeros = {5, 2, 8, 1, 9, 3, 7, 4, 6};

        // 2. Imprimir el arreglo original
        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        // 3. Encontrar el número mayor
        int mayor = encontrarMayor(numeros);
        System.out.println("El número mayor es: " + mayor);

        // 4. Calcular el promedio
        double promedio = calcularPromedio(numeros);
        System.out.println("El promedio es: " + promedio);

        // 5. Invertir el arreglo
        invertirArreglo(numeros);
        System.out.println("Arreglo invertido:");
        imprimirArreglo(numeros);

        // 6. Ordenar el arreglo (implementa el método ordenarArreglo)
        ordenarArreglo(numeros);
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(numeros);
    }

    // Método para imprimir el arreglo

    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int encontrarMayor(int[] arr) {
        int mayor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > mayor) {
                mayor = arr[i];
            }
        }
        return mayor;
    }

    public static double calcularPromedio(int[] arr) {
        // Implementa este método
        int suma = 0;
        for (int num : arr) {
            suma += num;
        }
        return (double) suma / arr.length;

    }

    public static void invertirArreglo(int[] arr) {
        int izquierda = 0;
        int derecha = arr.length - 1;
        while (izquierda < derecha) {
            int temp = arr[izquierda];
            arr[izquierda] = arr[derecha];
            arr[derecha] = temp;
            izquierda++;
            derecha--;
        }
    }

        public static void ordenarArreglo(int[] arr) {
            boolean intercambio;
            for (int i = 0; i < arr.length - 1; i++) {
                intercambio = false;
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        intercambio = true;
                    }
                }
                if (!intercambio) {
                    break;
                }
            }
        }}