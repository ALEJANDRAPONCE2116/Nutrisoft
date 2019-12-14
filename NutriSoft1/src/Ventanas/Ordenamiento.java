package Ventanas;
public class Ordenamiento {
    public Ordenamiento (){
//CARBOHIDRATOS
        String [] arregloCarbohidratos = new String[52];
        //FRUTAS
        arregloCarbohidratos[0] = "2.91 Fresas"; 
        arregloCarbohidratos[1] = "1.85 Naranja";
        arregloCarbohidratos[2] = "6.67 Platano";
        arregloCarbohidratos[3] = "4.05 Melon";
        arregloCarbohidratos[4] = "3.72 Manzana";
        arregloCarbohidratos[5] = "3.72 Papaya";
        arregloCarbohidratos[6] = "3.46 Pera";
        arregloCarbohidratos[7] = "3.4 Piña";
        arregloCarbohidratos[8] = "3.88 Guayaba";
        arregloCarbohidratos[9] = "2.04 Moras";
        arregloCarbohidratos[10] = "9.5 Durazno";
        arregloCarbohidratos[11] = "4.18 Mango";
        //VERDURAS
        arregloCarbohidratos[12] = "27.94 Elote";
        arregloCarbohidratos[13] = "0.85 Chile";
        arregloCarbohidratos[14] = "1.14 Tomate";
        arregloCarbohidratos[15] = "1.73 Cebolla";
        arregloCarbohidratos[16] = "0.87 Brocoli";
        arregloCarbohidratos[17] = "0.13 Aguacate";
        arregloCarbohidratos[18] = "4.83 Papa";
        arregloCarbohidratos[19] = "1.5 Calabaza";
        arregloCarbohidratos[20] = "1.55 Zanahoria";
        arregloCarbohidratos[21] = "0.81 Apio";
        arregloCarbohidratos[22] = "0.46 Lechuga";
        arregloCarbohidratos[23] = "0.18 Champiñones";
        //CARNE
        arregloCarbohidratos[24] = "0.0 Res";
        arregloCarbohidratos[25] = "0.0 Pescado";
        arregloCarbohidratos[26] = "0.0 Atun";
        arregloCarbohidratos[27] = "0.0 Cerdo";
        arregloCarbohidratos[28] = "0.0 Pollo";
        arregloCarbohidratos[29] = "0.0 Mariscos";
        //CEREALES
        arregloCarbohidratos[30] = "23.15 Pasta";
        arregloCarbohidratos[31] = "52 Pan";
        arregloCarbohidratos[32] = "68.9 Quinoa";
        arregloCarbohidratos[33] = "26.64 Arroz";
        arregloCarbohidratos[34] = "9.99 Trigo";
        arregloCarbohidratos[35] = "5.94 Maiz";
        //LEGUMINOSAS
        arregloCarbohidratos[36] = "62.4 Frijoles";
        arregloCarbohidratos[37] = "6.29 Soya";
        arregloCarbohidratos[38] = "54.8 Alubias";
        arregloCarbohidratos[39] = "19.5 Lentejas";
        arregloCarbohidratos[40] = "19.6 Habas";
        arregloCarbohidratos[42] = "25 Ejotes";
        arregloCarbohidratos[43] = "44.0 Garbanzos";
        arregloCarbohidratos[44] = "4.6 Cacahuates";
        //OTROS
        arregloCarbohidratos[45] = "4.8 Leche";
        arregloCarbohidratos[46] = "1.1 Huevo";
        arregloCarbohidratos[47] = "82.4 Miel";
        arregloCarbohidratos[48] = "5.6 Queso";
        arregloCarbohidratos[49] = "1.4 Yogurt";
        arregloCarbohidratos[50] = "77.9 Palomitas";
        arregloCarbohidratos[51] = "76.4 Chocolate";
        arregloCarbohidratos[52] = "63.9 Galletas";
 
//PROTEINA
        String [] arregloProteina = new String[12];
        //FRUTAS
        arregloProteina[0] = "0.185 Fresas"; 
        arregloProteina[1] = "0.172 Naranja";
        arregloProteina[2] = "0.225 Platano";
        arregloProteina[3] = "0.187 Melon";
        arregloProteina[4] = "0.066 Manzana";
        arregloProteina[5] = "0.127 Papaya";
        arregloProteina[6] = "0.091 Pera";
        arregloProteina[7] = "0.093 Piña";
        arregloProteina[8] = "0.174 Guayaba";
        arregloProteina[9] = "0.253 Moras";
        arregloProteina[10] = "0.09 Durazno";
        arregloProteina[11] = "0.134 Mango";
        //VERDURAS
        arregloProteina[12] = "17.82 Elote";
        arregloProteina[13] = "0.17 Chile";
        arregloProteina[14] = "0.187 Tomate";
        arregloProteina[15] = "0.253 Cebolla";
        arregloProteina[16] = "0.755 Brocoli";
        arregloProteina[17] = "0.399 Aguacate";
        arregloProteina[18] = "4.97 Papa";
        arregloProteina[19] = "0.24 Calabaza";
        arregloProteina[20] = "1.43 Zanahoria";
        arregloProteina[21] = "0.253 Apio";
        arregloProteina[22] = "0.291 Lechuga";
        arregloProteina[23] = "0.902 Champiñones";
        //CARNE
        arregloProteina[24] = "19.0 Res";
        arregloProteina[25] = "20.08 Pescado";
        arregloProteina[26] = "18.9 Atun";
        arregloProteina[27] = "36.64 Cerdo";
        arregloProteina[28] = "32.7 Pollo";
        arregloProteina[29] = "18.1 Mariscos";
        //CEREALES
        arregloProteina[30] = "27.12 Pasta";
        arregloProteina[31] = "3.5 Pan";
        arregloProteina[32] = "27.8 Quinoa";
        arregloProteina[33] = "14.15 Arroz";
        arregloProteina[34] = "60.69 Trigo";
        arregloProteina[35] = "7.04 Maiz";
        //LEGUMINOSAS
        arregloProteina[36] = "21.6 Frijoles";
        arregloProteina[37] = "34.74 Soya";
        arregloProteina[38] = "21.4 Alubias";
        arregloProteina[39] = "9 Lentejas";
        arregloProteina[40] = "7.6 Habas";
        arregloProteina[42] = "8.6 Ejotes";
        arregloProteina[43] = "20.8 Garbanzos";
        arregloProteina[44] = "8.4 Cacahuates";
        //OTROS
        arregloProteina[45] = "3.1 Leche";
        arregloProteina[46] = "12.6 Huevo";
        arregloProteina[47] = "0.003 Miel";
        arregloProteina[48] = "21.6 Queso";
        arregloProteina[49] = "8.5 Yogurt";
        arregloProteina[50] = "12.9 Palomitas";
        arregloProteina[51] = "2.4 Chocolate";
        arregloProteina[52] = "5.1 Galletas";
        
        //VITAMINA B12
        String [] arregloVb12 = new String[6];
        arregloVb12[0] = "2.6 Res"; 
        arregloVb12[1] = "1.58 Pescado"; 
        arregloVb12[2] = "2.1 Cerdo"; 
        arregloVb12[3] = "12 Pollo"; 
        arregloVb12[4] = "4.10 Mariscos "; 
        arregloVb12[5] = "7.5 Pan"; 
 
        //FIBRA
        String [] arregloFibra = new String[12];
        //FRUTAS
        arregloFibra[0] = "1.67 Fresas"; 
        arregloFibra[1] = "5.6 Naranja";
        arregloFibra[2] = "8.5 Platano";
        arregloFibra[3] = "2.43 Melon";
        arregloFibra[4] = "6.73 Manzana";
        arregloFibra[5] = "6 Papaya";
        arregloFibra[6] = "7.33 Pera";
        arregloFibra[7] = "6.33 Piña";
        arregloFibra[8] = "18 Guayaba";
        arregloFibra[9] = "10.53 Moras";
        arregloFibra[10] = "1.5 Durazno";
        arregloFibra[11] = "5.67 Mango";
        //VERDURAS
        arregloFibra[12] = "28.5 Elote";
        arregloFibra[13] = "6.33 Chile";
        arregloFibra[14] = "4.67 Tomate";
        arregloFibra[15] = "6 Cebolla";
        arregloFibra[16] = "10 Brocoli";
        arregloFibra[17] = "21.1 Aguacate";
        arregloFibra[18] = "6.9 Papa";
        arregloFibra[19] = "7.2 Calabaza";
        arregloFibra[20] = "2.07 Zanahoria";
        arregloFibra[21] = "4.67 Apio";
        arregloFibra[22] = "5 Lechuga";
        arregloFibra[23] = "7.2 Champiñones";
        //CARNE
        arregloFibra[24] = "0 Res";
        arregloFibra[25] = "0 Pescado";
        arregloFibra[26] = "0 Atun";
        arregloFibra[27] = "0 Cerdo";
        arregloFibra[28] = "0 Pollo";
        arregloFibra[29] = "0 Mariscos";
        //CEREALES
        arregloFibra[30] = "11.8 Pasta";
        arregloFibra[31] = "0.2 Pan";
        arregloFibra[32] = "23.33 Quinoa";
        arregloFibra[33] = "5.45 Arroz";
        arregloFibra[34] = "49.65 Trigo";
        arregloFibra[35] = "10 Maiz";
        //LEGUMINOSAS
        arregloFibra[36] = "15.2 Frijoles";
        arregloFibra[37] = "22.0 Soya";
        arregloFibra[38] = "21.3 Alubias";
        arregloFibra[39] = "7.9 Lentejas";
        arregloFibra[40] = "5.4 Habas";
        arregloFibra[42] = "8.8 Ejotes";
        arregloFibra[43] = "15.5 Garbanzos";
        arregloFibra[44] = "2.8 Cacahuates";
        //OTROS
        arregloFibra[45] = "0 Leche";
        arregloFibra[46] = "0 Huevo";
        arregloFibra[47] = "0 Miel";
        arregloFibra[48] = "0 Queso";
        arregloFibra[49] = "0 Yogurt";
        arregloFibra[50] = "14.5 Palomitas";
        arregloFibra[51] = "1.7 Chocolate";
        arregloFibra[52] = "2.4 Galletas";
        
        //CALCIO
        String [] arregloCalcio = new String[12];
        //FRUTAS
        arregloCalcio[0] = "4.10 Fresas"; 
        arregloCalcio[1] = "2.15 Naranja";
        arregloCalcio[2] = "0.73 Platano";
        arregloCalcio[3] = "2.1.56 Melon";
        arregloCalcio[4] = "0.55 Manzana";
        arregloCalcio[5] = "2.4 Papaya";
        arregloCalcio[6] = "0.96 Pera";
        arregloCalcio[7] = "1.45 Piña";
        arregloCalcio[8] = "1.7 Guayaba";
        arregloCalcio[9] = "4.4 Moras";
        arregloCalcio[10] = "0 Durazno";
        arregloCalcio[11] = "1.2 Mango";
        //VERDURAS
        arregloCalcio[12] = "1.5 Elote";
        arregloCalcio[13] = "3 Chile";
        arregloCalcio[14] = "1.06 Tomate";
        arregloCalcio[15] = "2.54 Cebolla";
        arregloCalcio[16] = "5.8 Brocoli";
        arregloCalcio[17] = "1.2 Aguacate";
        arregloCalcio[18] = "0.64 Papa";
        arregloCalcio[19] = "2.2 Calabaza";
        arregloCalcio[20] = "2.7 Zanahoria";
        arregloCalcio[21] = "4.1 Apio";
        arregloCalcio[22] = "3.47 Lechuga";
        arregloCalcio[23] = "1.08 Champiñones";
        //CARNE
        arregloCalcio[24] = "0 Res";
        arregloCalcio[25] = "10.0 Pescado";
        arregloCalcio[26] = "0.01 Atun";
        arregloCalcio[27] = "0 Cerdo";
        arregloCalcio[28] = "0 Pollo";
        arregloCalcio[29] = "80.0 Mariscos";
        //CEREALES
        arregloCalcio[30] = "2.4 Pasta";
        arregloCalcio[31] = "0.03 Pan";
        arregloCalcio[32] = "127.0 Quinoa";
        arregloCalcio[33] = "1.4 Arroz";
        arregloCalcio[34] = "4.9 Trigo";
        arregloCalcio[35] = "0.3 Maiz";
        //LEGUMINOSAS
        arregloCalcio[36] = "123.0 Frijoles";
        arregloCalcio[37] = "201.0 Soya";
        arregloCalcio[38] = "0 Alubias";
        arregloCalcio[39] = "0.01 Lentejas";
        arregloCalcio[40] = "0 Habas";
        arregloCalcio[42] = "0 Ejotes";
        arregloCalcio[43] = "143.0 Garbanzos";
        arregloCalcio[44] = "0.01 Cacahuates";
        //OTROS
        arregloCalcio[45] = "0.0 Leche";
        arregloCalcio[46] = "0.05 Huevo";
        arregloCalcio[47] = "0 Miel";
        arregloCalcio[48] = "0.6 Queso";
        arregloCalcio[49] = "0.02 Yogurt";
        arregloCalcio[50] = "0 Palomitas";
        arregloCalcio[51] = "0.04 Chocolate";
        arregloCalcio[52] = "0.02 Galletas";
        
        //CALCIO
        String [] arregloHierro = new String[12];
        //FRUTAS
        arregloHierro[0] = "6.13 Fresas"; 
        arregloHierro[1] = "5.75 Naranja";
        arregloHierro[2] = "7.38 Platano";
        arregloHierro[3] = "4.38 Melon";
        arregloHierro[4] = "7 Manzana";
        arregloHierro[5] = "1.25 Papaya";
        arregloHierro[6] = "3.75 Pera";
        arregloHierro[7] = "5.13 Piña";
        arregloHierro[8] = "7.5 Guayaba";
        arregloHierro[9] = "11.25 Moras";
        arregloHierro[10] = "0 Durazno";
        arregloHierro[11] = "5 Mango";
        //VERDURAS
        arregloHierro[12] = "53.75 Elote";
        arregloHierro[13] = "15 Chile";
        arregloHierro[14] = "8.75 Tomate";
        arregloHierro[15] = "3.38 Cebolla";
        arregloHierro[16] = "10.75 Brocoli";
        arregloHierro[17] = "6.13 Aguacate";
        arregloHierro[18] = "5.38 Papa";
        arregloHierro[19] = "10 Calabaza";
        arregloHierro[20] = "6.25 Zanahoria";
        arregloHierro[21] = "5 Apio";
        arregloHierro[22] = "12.5 Lechuga";
        arregloHierro[23] = "12.5 Champiñones";
        //CARNE
        arregloHierro[24] = "2.6 Res";
        arregloHierro[25] = "0.56 Pescado";
        arregloHierro[26] = "0.08 Atun";
        arregloHierro[27] = "0.9 Cerdo";
        arregloHierro[28] = "0.7 Pollo";
        arregloHierro[29] = "1.6 Mariscos";
        //CEREALES
        arregloHierro[30] = "22.5 Pasta";
        arregloHierro[31] = "0.02 Pan";
        arregloHierro[32] = "12.0 Quinoa";
        arregloHierro[33] = "10 Arroz";
        arregloHierro[34] = "106.25 Trigo";
        arregloHierro[35] = "7.5 Maiz";
        //LEGUMINOSAS
        arregloHierro[36] = "5.0 Frijoles";
        arregloHierro[37] = "6.6 Soya";
        arregloHierro[38] = "6.2 Alubias";
        arregloHierro[39] = "0.03 Lentejas";
        arregloHierro[40] = "0 Habas";
        arregloHierro[42] = "0 Ejotes";
        arregloHierro[43] = "6.8 Garbanzos";
        arregloHierro[44] = "0 Cacahuates";
        //OTROS
        arregloHierro[45] = "0 Leche";
        arregloHierro[46] = "0 Huevo";
        arregloHierro[47] = "0 Miel";
        arregloHierro[48] = "0 Queso";
        arregloHierro[49] = "0 Yogurt";
        arregloHierro[50] = "0.01 Palomitas";
        arregloHierro[51] = "0.03 Chocolate";
        arregloHierro[52] = "0 Galletas";
        
        //CALCIO
        String [] arregloMagnesio = new String[12];
        //FRUTAS
        arregloMagnesio[0] = "41.25 Fresas"; 
        arregloMagnesio[1] = "49.25 Naranja";
        arregloMagnesio[2] = "92.5 Platano";
        arregloMagnesio[3] = "77.5 Melon";
        arregloMagnesio[4] = "30 Manzana";
        arregloMagnesio[5] = "64.25 Papaya";
        arregloMagnesio[6] = "29 Pera";
        arregloMagnesio[7] = "43.75 Piña";
        arregloMagnesio[8] = "72.5 Guayaba";
        arregloMagnesio[9] = "47.5 Moras";
        arregloMagnesio[10] = "0 Durazno";
        arregloMagnesio[11] = "42.5 Mango";
        //VERDURAS
        arregloMagnesio[12] = "82.5 Elote";
        arregloMagnesio[13] = "55 Chile";
        arregloMagnesio[14] = "60.5 Tomate";
        arregloMagnesio[15] = "40.5 Cebolla";
        arregloMagnesio[16] = "69.75 Brocoli";
        arregloMagnesio[17] = "121.75 Aguacate";
        arregloMagnesio[18] = "104.5 Papa";
        arregloMagnesio[19] = "76 Calabaza";
        arregloMagnesio[20] = "54.75 Zanahoria";
        arregloMagnesio[21] = "80 Apio";
        arregloMagnesio[22] = "55 Lechuga";
        arregloMagnesio[23] = "97.5 Champiñones";
        //CARNE
        arregloMagnesio[24] = "21.0 Res";
        arregloMagnesio[25] = "27.0 Pescado";
        arregloMagnesio[26] = "0.02 Atun";
        arregloMagnesio[27] = "13.0 Cerdo";
        arregloMagnesio[28] = "0 Pollo";
        arregloMagnesio[29] = "36.0 Mariscos";
        //CEREALES
        arregloMagnesio[30] = "59 Pasta";
        arregloMagnesio[31] = "0.5 Pan";
        arregloMagnesio[32] = "697 Quinoa";
        arregloMagnesio[33] = "27.25 Arroz";
        arregloMagnesio[34] = "248.25 Trigo";
        arregloMagnesio[35] = "50 Maiz";
        //LEGUMINOSAS
        arregloMagnesio[36] = "1483.0 Frijoles";
        arregloMagnesio[37] = "1799.0 Soya";
        arregloMagnesio[38] = "163.0 Alubias";
        arregloMagnesio[39] = "0.03 Lentejas";
        arregloMagnesio[40] = "0 Habas";
        arregloMagnesio[42] = "0 Ejotes";
        arregloMagnesio[43] = "875.0 Garbanzos";
        arregloMagnesio[44] = "0.05 Cacahuates";
        //OTROS
        arregloMagnesio[45] = "0.01 Leche";
        arregloMagnesio[46] = "0 Huevo";
        arregloMagnesio[47] = "0 Miel";
        arregloMagnesio[48] = "0.02 Queso";
        arregloMagnesio[49] = "0 Yogurt";
        arregloMagnesio[50] = "0.1 Palomitas";
        arregloMagnesio[51] = "0.03 Chocolate";
        arregloMagnesio[52] = "0 Galletas";
        
        //SODIO
        String [] arregloSodio = new String[12];
        //FRUTAS
        arregloSodio[0] = "0.09 Fresas"; 
        arregloSodio[1] = "0.09 Naranja";
        arregloSodio[2] = "0.06 Platano";
        arregloSodio[3] = "1.06 Melon";
        arregloSodio[4] = "0.07 Manzana";
        arregloSodio[5] = "0.19 Papaya";
        arregloSodio[6] = "0.13 Pera";
        arregloSodio[7] = "0.13 Piña";
        arregloSodio[8] = "0.25 Guayaba";
        arregloSodio[9] = "0.15 Moras";
        arregloSodio[10] = "0 Durazno";
        arregloSodio[11] = "0.31 Mango";
        //VERDURAS
        arregloSodio[12] = "0.38 Elote";
        arregloSodio[13] = "0.44 Chile";
        arregloSodio[14] = "0.56 Tomate";
        arregloSodio[15] = "0.19 Cebolla";
        arregloSodio[16] = "1.38 Brocoli";
        arregloSodio[17] = "0.29 Aguacate";
        arregloSodio[18] = "0.17 Papa";
        arregloSodio[19] = "0.19 Calabaza";
        arregloSodio[20] = "3.25 Zanahoria";
        arregloSodio[21] = "6.25 Apio";
        arregloSodio[22] = "0.19 Lechuga";
        arregloSodio[23] = "0.49 Champiñones";
        //CARNE
        arregloSodio[24] = "72.0 Res";
        arregloSodio[25] = "52.0 Pescado";
        arregloSodio[26] = "0.3 Atun";
        arregloSodio[27] = "515.0 Cerdo";
        arregloSodio[28] = "396 Pollo";
        arregloSodio[29] = "192.0 Mariscos";
        //CEREALES
        arregloSodio[30] = "0.44 Pasta";
        arregloSodio[31] = "0.03 Pan";
        arregloSodio[32] = "0 Quinoa";
        arregloSodio[33] = "0.24 Arroz";
        arregloSodio[34] = "0.31 Trigo";
        arregloSodio[35] = "19 Maiz";
        //LEGUMINOSAS
        arregloSodio[36] = "5.0 Frijoles";
        arregloSodio[37] = "4.7 Soya";
        arregloSodio[38] = "0 Alubias";
        arregloSodio[39] = "0.2 Lentejas";
        arregloSodio[40] = "0.1 Habas";
        arregloSodio[42] = "0.4 Ejotes";
        arregloSodio[43] = "25.0 Garbanzos";
        arregloSodio[44] = "0.1 Cacahuates";
        //OTROS
        arregloSodio[45] = "0.1 Leche";
        arregloSodio[46] = "0.1 Huevo";
        arregloSodio[47] = "0.1 Miel";
        arregloSodio[48] = "0.6 Queso";
        arregloSodio[49] = "0.1 Yogurt";
        arregloSodio[50] = "0.1 Palomitas";
        arregloSodio[51] = "0.1 Chocolate";
        arregloSodio[52] = "0.3 Galletas";
        
        //POTASIO
        String [] arregloPotasio = new String[12];
        //FRUTAS
        arregloPotasio[0] = "8.25 Fresas"; 
        arregloPotasio[1] = "8.05 Naranja";
        arregloPotasio[2] = "18.5 Platano";
        arregloPotasio[3] = "15.5 Melon";
        arregloPotasio[4] = "6 Manzana";
        arregloPotasio[5] = "5.8 Papaya";
        arregloPotasio[6] = "0.13 Pera";
        arregloPotasio[7] = "0.13 Piña";
        arregloPotasio[8] = "0.25 Guayaba";
        arregloPotasio[9] = "0.15 Moras";
        arregloPotasio[10] = "0 Durazno";
        arregloPotasio[11] = "0.31 Mango";
        //VERDURAS
        arregloPotasio[12] = "0.38 Elote";
        arregloPotasio[13] = "0.44 Chile";
        arregloPotasio[14] = "0.56 Tomate";
        arregloPotasio[15] = "0.19 Cebolla";
        arregloPotasio[16] = "1.38 Brocoli";
        arregloPotasio[17] = "0.29 Aguacate";
        arregloPotasio[18] = "0.17 Papa";
        arregloPotasio[19] = "0.19 Calabaza";
        arregloPotasio[20] = "3.25 Zanahoria";
        arregloPotasio[21] = "6.25 Apio";
        arregloPotasio[22] = "0.19 Lechuga";
        arregloPotasio[23] = "0.49 Champiñones";
        //CARNE
        arregloPotasio[24] = "72.0 Res";
        arregloPotasio[25] = "52.0 Pescado";
        arregloPotasio[26] = "0.3 Atun";
        arregloPotasio[27] = "515.0 Cerdo";
        arregloPotasio[28] = "396 Pollo";
        arregloPotasio[29] = "192.0 Mariscos";
        //CEREALES
        arregloPotasio[30] = "0.44 Pasta";
        arregloPotasio[31] = "0.03 Pan";
        arregloPotasio[32] = "0 Quinoa";
        arregloPotasio[33] = "0.24 Arroz";
        arregloPotasio[34] = "0.31 Trigo";
        arregloPotasio[35] = "19 Maiz";
        //LEGUMINOSAS
        arregloPotasio[36] = "5.0 Frijoles";
        arregloPotasio[37] = "4.7 Soya";
        arregloPotasio[38] = "0 Alubias";
        arregloPotasio[39] = "0.2 Lentejas";
        arregloPotasio[40] = "0.1 Habas";
        arregloPotasio[42] = "0.4 Ejotes";
        arregloPotasio[43] = "25.0 Garbanzos";
        arregloPotasio[44] = "0.1 Cacahuates";
        //OTROS
        arregloPotasio[45] = "0.1 Leche";
        arregloPotasio[46] = "0.1 Huevo";
        arregloPotasio[47] = "0.1 Miel";
        arregloPotasio[48] = "0.6 Queso";
        arregloPotasio[49] = "0.1 Yogurt";
        arregloPotasio[50] = "0.1 Palomitas";
        arregloPotasio[51] = "0.1 Chocolate";
        arregloPotasio[52] = "0.3 Galletas";
        
        selectionSortCarbo(arregloCarbohidratos);
        imprimircarb(arregloCarbohidratos);
        
        selectionSortProteina(arregloProteina);
        imprimirProt(arregloProteina);
        
        selectionSortVB12(arregloVb12);
        imprimirVB12(arregloVb12);
        
        selectionSortFibra(arregloFibra);
        imprimirFibra(arregloFibra);
        
        selectionSortCalcio(arregloCalcio);
        imprimirCalcio(arregloCalcio);
        
        selectionSortHierro(arregloHierro);
        imprimirHierro(arregloHierro);
        
        selectionSortMagnesio(arregloMagnesio);
        imprimirMagnesio(arregloMagnesio);
        
        selectionSortSodio(arregloSodio);
        imprimirSodio(arregloSodio);
        
    }
 public static void selectionSortCarbo(String [] arregloCarbohidratos) {
        for (int i = 0; i < arregloCarbohidratos.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arregloCarbohidratos.length; j++) {
                if (arregloCarbohidratos[j].compareTo(arregloCarbohidratos[min]) <0 ) {
                    min = j;
                }
            }
            String temp = arregloCarbohidratos[i];
            arregloCarbohidratos[i] = arregloCarbohidratos[min];
            arregloCarbohidratos[min] = temp;
        }
    }
    
    public static void imprimircarb(String[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
    
    public static void selectionSortProteina(String [] arregloProteina) {
        for (int i = 0; i < arregloProteina.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arregloProteina.length; j++) {
                if (arregloProteina[j].compareTo(arregloProteina[min]) <0 ) {
                    min = j;
                }
            }
            String temp = arregloProteina[i];
            arregloProteina[i] = arregloProteina[min];
            arregloProteina[min] = temp;
        }
    }
    
    public static void imprimirProt(String[] arregloP) {
        for (int i = 0; i < arregloP.length; i++) {
            System.out.print("[" + arregloP[i] + "]");
        }
        System.out.println("");
    }
    
     public static void selectionSortVB12(String [] arregloVB12) {
        for (int i = 0; i < arregloVB12.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arregloVB12.length; j++) {
                if (arregloVB12[j].compareTo(arregloVB12[min]) <0 ) {
                    min = j;
                }
            }
            String temp = arregloVB12[i];
            arregloVB12[i] = arregloVB12[min];
            arregloVB12[min] = temp;
        }
    }
    
    public static void imprimirVB12(String[] arreglob12) {
        for (int i = 0; i < arreglob12.length; i++) {
            System.out.print("[" + arreglob12[i] + "]");
        }
        System.out.println("");
    }
    
     public static void selectionSortFibra(String [] arregloFibra) {
        for (int i = 0; i < arregloFibra.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arregloFibra.length; j++) {
                if (arregloFibra[j].compareTo(arregloFibra[min]) <0 ) {
                    min = j;
                }
            }
            String temp = arregloFibra[i];
            arregloFibra[i] = arregloFibra[min];
            arregloFibra[min] = temp;
        }
    }
    
    public static void imprimirFibra(String[] arregloFibra) {
        for (int i = 0; i < arregloFibra.length; i++) {
            System.out.print("[" + arregloFibra[i] + "]");
        }
        System.out.println("");
    }
    
    public static void selectionSortCalcio(String [] arregloCalcio) {
        for (int i = 0; i < arregloCalcio.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arregloCalcio.length; j++) {
                if (arregloCalcio[j].compareTo(arregloCalcio[min]) <0 ) {
                    min = j;
                }
            }
            String temp = arregloCalcio[i];
            arregloCalcio[i] = arregloCalcio[min];
            arregloCalcio[min] = temp;
        }
    }
    
    public static void imprimirCalcio(String[] arregloCalcio) {
        for (int i = 0; i < arregloCalcio.length; i++) {
            System.out.print("[" + arregloCalcio[i] + "]");
        }
        System.out.println("");
    }
    
    public static void selectionSortHierro(String [] arregloHierro) {
        for (int i = 0; i < arregloHierro.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arregloHierro.length; j++) {
                if (arregloHierro[j].compareTo(arregloHierro[min]) <0 ) {
                    min = j;
                }
            }
            String temp = arregloHierro[i];
            arregloHierro[i] = arregloHierro[min];
            arregloHierro[min] = temp;
        }
    }
    
    public static void imprimirHierro(String[] arregloHierro) {
        for (int i = 0; i < arregloHierro.length; i++) {
            System.out.print("[" + arregloHierro[i] + "]");
        }
        System.out.println("");
    }
    
    public static void selectionSortMagnesio(String [] arregloMagnesio) {
        for (int i = 0; i < arregloMagnesio.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arregloMagnesio.length; j++) {
                if (arregloMagnesio[j].compareTo(arregloMagnesio[min]) <0 ) {
                    min = j;
                }
            }
            String temp = arregloMagnesio[i];
            arregloMagnesio[i] = arregloMagnesio[min];
            arregloMagnesio[min] = temp;
        }
    }
    
    public static void imprimirMagnesio(String[] arregloMagnesio) {
        for (int i = 0; i < arregloMagnesio.length; i++) {
            System.out.print("[" + arregloMagnesio[i] + "]");
        }
        System.out.println("");
    }
    
    public static void selectionSortSodio(String [] arregloSodio) {
        for (int i = 0; i < arregloSodio.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arregloSodio.length; j++) {
                if (arregloSodio[j].compareTo(arregloSodio[min]) <0 ) {
                    min = j;
                }
            }
            String temp = arregloSodio[i];
            arregloSodio[i] = arregloSodio[min];
            arregloSodio[min] = temp;
        }
    }
    
    public static void imprimirSodio(String[] arregloSodio) {
        for (int i = 0; i < arregloSodio.length; i++) {
            System.out.print("[" + arregloSodio[i] + "]");
        }
        System.out.println("");
    }
}

