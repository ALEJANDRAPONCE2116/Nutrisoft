package Ventanas;
import static Ventanas.ListaPrin.lista1;
import static Ventanas.Lista.chkFresas;
import java.awt.Checkbox;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Lista extends javax.swing.JFrame {
    Nutrientes obj_nutrientes;
    // Lista lista;
    // Arreglo datos = new Arreglo();
    Nutrientes nutri;
    
    public Lista() {
        initComponents();
        setLocationRelativeTo(null);//centrar
        setResizable(false);// no cambiar maximizar
        setTitle("Nutrisoft");//NOMBRE A LA PANTALLA
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        chkPera = new javax.swing.JCheckBox();
        chkFresas = new javax.swing.JCheckBox();
        chkNaranja = new javax.swing.JCheckBox();
        chkPlatano = new javax.swing.JCheckBox();
        chkMelon = new javax.swing.JCheckBox();
        chkManzana = new javax.swing.JCheckBox();
        chkPapaya = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        chkPiña = new javax.swing.JCheckBox();
        chkGuayaba = new javax.swing.JCheckBox();
        chkMoras = new javax.swing.JCheckBox();
        chkDurazno = new javax.swing.JCheckBox();
        Mango = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        chkPapa = new javax.swing.JCheckBox();
        chkApio = new javax.swing.JCheckBox();
        chkElote = new javax.swing.JCheckBox();
        chkLechuga = new javax.swing.JCheckBox();
        chkChile = new javax.swing.JCheckBox();
        chkChampiñones = new javax.swing.JCheckBox();
        chkTomate = new javax.swing.JCheckBox();
        chkCebolla = new javax.swing.JCheckBox();
        chkBrocoli = new javax.swing.JCheckBox();
        chkAguacate = new javax.swing.JCheckBox();
        chkCalabaza = new javax.swing.JCheckBox();
        chkZanahoria = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        chkPollo = new javax.swing.JCheckBox();
        chkRes = new javax.swing.JCheckBox();
        chkPescado = new javax.swing.JCheckBox();
        chkCerdo = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        chkQuinoa = new javax.swing.JCheckBox();
        chkArroz = new javax.swing.JCheckBox();
        chkTrigo = new javax.swing.JCheckBox();
        chkMaiz = new javax.swing.JCheckBox();
        chkPasta = new javax.swing.JCheckBox();
        chkPan = new javax.swing.JCheckBox();
        chkGarbanzos = new javax.swing.JCheckBox();
        chkFrijoles = new javax.swing.JCheckBox();
        chkSoya = new javax.swing.JCheckBox();
        chkAlubias = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        chkLentejas = new javax.swing.JCheckBox();
        chkHabas = new javax.swing.JCheckBox();
        chkEjotes = new javax.swing.JCheckBox();
        chkLeche = new javax.swing.JCheckBox();
        chkHuevo = new javax.swing.JCheckBox();
        chkMiel = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        chkQueso = new javax.swing.JCheckBox();
        chkYogurt = new javax.swing.JCheckBox();
        chkPalomitas = new javax.swing.JCheckBox();
        chkChocolate = new javax.swing.JCheckBox();
        Snacks = new javax.swing.JLabel();
        chkGalletas = new javax.swing.JCheckBox();
        chkCacahuates = new javax.swing.JCheckBox();
        chkAtun = new javax.swing.JCheckBox();
        chkMariscos = new javax.swing.JCheckBox();
        btnAnadirComida = new javax.swing.JButton();
        btnAnadirSnack = new javax.swing.JButton();
        btnAnadircena = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        imagfruta = new javax.swing.JLabel();
        imagfruta1 = new javax.swing.JLabel();
        imagfruta2 = new javax.swing.JLabel();
        imagfruta3 = new javax.swing.JLabel();
        imagfruta4 = new javax.swing.JLabel();
        imagfruta5 = new javax.swing.JLabel();
        imagfruta6 = new javax.swing.JLabel();
        btnAnadirDes2 = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(81, 96, 105));

        chkPera.setText("Pera");
        chkPera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPeraActionPerformed(evt);
            }
        });

        chkFresas.setText("Fresas");
        chkFresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFresasActionPerformed(evt);
            }
        });

        chkNaranja.setText("Naranja");
        chkNaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNaranjaActionPerformed(evt);
            }
        });

        chkPlatano.setText("Plátano");
        chkPlatano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPlatanoActionPerformed(evt);
            }
        });

        chkMelon.setText("Melón");
        chkMelon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMelonActionPerformed(evt);
            }
        });

        chkManzana.setText("Manzana");
        chkManzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkManzanaActionPerformed(evt);
            }
        });

        chkPapaya.setText("Papaya");
        chkPapaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPapayaActionPerformed(evt);
            }
        });

        jLabel3.setText("Fruta");

        chkPiña.setText("Piña");
        chkPiña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPiñaActionPerformed(evt);
            }
        });

        chkGuayaba.setText("Guayaba");
        chkGuayaba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGuayabaActionPerformed(evt);
            }
        });

        chkMoras.setText("Moras");
        chkMoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMorasActionPerformed(evt);
            }
        });

        chkDurazno.setText("Durazno");

        Mango.setText("Mango");
        Mango.setToolTipText("");
        Mango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MangoActionPerformed(evt);
            }
        });

        jLabel4.setText("Verdura");

        chkPapa.setText("Papa");
        chkPapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPapaActionPerformed(evt);
            }
        });

        chkApio.setText("Apio");
        chkApio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApioActionPerformed(evt);
            }
        });

        chkElote.setText("Elote");
        chkElote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEloteActionPerformed(evt);
            }
        });

        chkLechuga.setText("Lechuga");
        chkLechuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLechugaActionPerformed(evt);
            }
        });

        chkChile.setText("Chile");
        chkChile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkChileActionPerformed(evt);
            }
        });

        chkChampiñones.setText("Champiñones");
        chkChampiñones.setToolTipText("");
        chkChampiñones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkChampiñonesActionPerformed(evt);
            }
        });

        chkTomate.setText("Tomate");
        chkTomate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTomateActionPerformed(evt);
            }
        });

        chkCebolla.setText("Cebolla");
        chkCebolla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCebollaActionPerformed(evt);
            }
        });

        chkBrocoli.setText("Brócoli");
        chkBrocoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBrocoliActionPerformed(evt);
            }
        });

        chkAguacate.setText("Aguacate");
        chkAguacate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAguacateActionPerformed(evt);
            }
        });

        chkCalabaza.setText("Calabaza");
        chkCalabaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCalabazaActionPerformed(evt);
            }
        });

        chkZanahoria.setText("Zanahoria");
        chkZanahoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkZanahoriaActionPerformed(evt);
            }
        });

        jLabel5.setText("Carne");

        chkPollo.setText("Pollo");
        chkPollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPolloActionPerformed(evt);
            }
        });

        chkRes.setText("Res");
        chkRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkResActionPerformed(evt);
            }
        });

        chkPescado.setText("Salmón");
        chkPescado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPescadoActionPerformed(evt);
            }
        });

        chkCerdo.setText("Cerdo");
        chkCerdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCerdoActionPerformed(evt);
            }
        });

        jLabel6.setText("Cereales");

        chkQuinoa.setText("Quinoa");
        chkQuinoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkQuinoaActionPerformed(evt);
            }
        });

        chkArroz.setText("Arroz");
        chkArroz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkArrozActionPerformed(evt);
            }
        });

        chkTrigo.setText("Trigo");
        chkTrigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTrigoActionPerformed(evt);
            }
        });

        chkMaiz.setText("Maíz");
        chkMaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMaizActionPerformed(evt);
            }
        });

        chkPasta.setText("Pasta");
        chkPasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPastaActionPerformed(evt);
            }
        });

        chkPan.setText("Pan");
        chkPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPanActionPerformed(evt);
            }
        });

        chkGarbanzos.setText("Garbanzos");
        chkGarbanzos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGarbanzosActionPerformed(evt);
            }
        });

        chkFrijoles.setText("Frijoles");
        chkFrijoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFrijolesActionPerformed(evt);
            }
        });

        chkSoya.setText("Soya");
        chkSoya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSoyaActionPerformed(evt);
            }
        });

        chkAlubias.setText("Alubias");
        chkAlubias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAlubiasActionPerformed(evt);
            }
        });

        jLabel7.setText("Leguminosas");

        chkLentejas.setText("Lentejas");
        chkLentejas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLentejasActionPerformed(evt);
            }
        });

        chkHabas.setText("Habas");

        chkEjotes.setText("Ejotes");

        chkLeche.setText("Leche");
        chkLeche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLecheActionPerformed(evt);
            }
        });

        chkHuevo.setText("Huevo");
        chkHuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHuevoActionPerformed(evt);
            }
        });

        chkMiel.setText("Miel");
        chkMiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMielActionPerformed(evt);
            }
        });

        jLabel8.setText("Otros");

        chkQueso.setText("Queso");
        chkQueso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkQuesoActionPerformed(evt);
            }
        });

        chkYogurt.setText("Yogurt");

        chkPalomitas.setText("Palomitas");
        chkPalomitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPalomitasActionPerformed(evt);
            }
        });

        chkChocolate.setText("Chocolate");
        chkChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkChocolateActionPerformed(evt);
            }
        });

        Snacks.setText("Snack");

        chkGalletas.setText("Galletas ");
        chkGalletas.setAutoscrolls(true);
        chkGalletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGalletasActionPerformed(evt);
            }
        });

        chkCacahuates.setText("Cacahuates");
        chkCacahuates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCacahuatesActionPerformed(evt);
            }
        });

        chkAtun.setText("Atún");

        chkMariscos.setText("Mariscos");
        chkMariscos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMariscosActionPerformed(evt);
            }
        });

        btnAnadirComida.setText("Añadir a Comida");
        btnAnadirComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirComidaActionPerformed(evt);
            }
        });

        btnAnadirSnack.setText("Añadir a Snack");
        btnAnadirSnack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirSnackActionPerformed(evt);
            }
        });

        btnAnadircena.setText("Añadir a Cena");
        btnAnadircena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadircenaActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        imagfruta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Comidas1/frutas.png"))); // NOI18N

        imagfruta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Comidas1/leche.png"))); // NOI18N

        imagfruta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Comidas1/verduras 3.png"))); // NOI18N

        imagfruta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Comidas1/carne.png"))); // NOI18N

        imagfruta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Comidas1/grano.png"))); // NOI18N

        imagfruta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Comidas1/peanut.png"))); // NOI18N

        imagfruta6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Comidas1/palomitas-de-maiz.png"))); // NOI18N

        btnAnadirDes2.setText("Añadir a Desayuno");
        btnAnadirDes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirDes2ActionPerformed(evt);
            }
        });

        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(imagfruta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkMoras)
                            .addComponent(chkGuayaba)
                            .addComponent(chkPiña)
                            .addComponent(chkPera)
                            .addComponent(chkFresas)
                            .addComponent(chkPlatano)
                            .addComponent(chkMelon)
                            .addComponent(chkManzana)
                            .addComponent(chkPapaya)
                            .addComponent(chkNaranja)
                            .addComponent(Mango)
                            .addComponent(chkDurazno))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkChile)
                                    .addComponent(chkTomate)
                                    .addComponent(chkCebolla)
                                    .addComponent(chkBrocoli)
                                    .addComponent(chkAguacate)
                                    .addComponent(chkCalabaza)
                                    .addComponent(chkPapa)
                                    .addComponent(chkLechuga)
                                    .addComponent(chkApio)
                                    .addComponent(chkZanahoria)
                                    .addComponent(imagfruta2)
                                    .addComponent(chkElote))
                                .addGap(33, 33, 33))
                            .addComponent(chkChampiñones, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(347, 347, 347)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(imagfruta1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkQueso)
                                            .addComponent(chkYogurt)
                                            .addComponent(chkLeche)
                                            .addComponent(chkHuevo)
                                            .addComponent(chkMiel))))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(Snacks))
                                    .addComponent(imagfruta6)
                                    .addComponent(chkPalomitas)
                                    .addComponent(chkChocolate)
                                    .addComponent(chkGalletas)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(imagfruta3)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(chkCerdo)
                                                        .addComponent(chkPollo))
                                                    .addGap(19, 19, 19))
                                                .addComponent(chkRes)
                                                .addComponent(chkPescado)
                                                .addComponent(chkAtun)
                                                .addComponent(chkMariscos)))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkMaiz)
                                            .addComponent(chkTrigo)
                                            .addComponent(chkPasta)
                                            .addComponent(chkPan)
                                            .addComponent(chkQuinoa)
                                            .addComponent(chkArroz)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(imagfruta4)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel5)))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(imagfruta5)
                                            .addComponent(chkCacahuates)
                                            .addComponent(chkGarbanzos)
                                            .addComponent(chkEjotes)
                                            .addComponent(chkSoya)
                                            .addComponent(chkAlubias)
                                            .addComponent(chkLentejas)
                                            .addComponent(chkHabas)
                                            .addComponent(chkFrijoles))))))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnadircena, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnadirSnack, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnadirDes2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnadirComida, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imagfruta5)
                                .addGap(24, 24, 24)
                                .addComponent(chkFrijoles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkSoya)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkAlubias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkLentejas)
                                .addGap(14, 14, 14)
                                .addComponent(chkHabas))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(imagfruta1)
                                        .addGap(30, 30, 30)
                                        .addComponent(chkLeche)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkHuevo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkMiel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Snacks)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(imagfruta6)
                                        .addGap(24, 24, 24)
                                        .addComponent(chkPalomitas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkChocolate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkGalletas)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkQueso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkYogurt)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkEjotes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkGarbanzos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCacahuates)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAnadircena)
                                    .addComponent(btnAnadirSnack)
                                    .addComponent(btnVolver)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAnadirDes2)
                                .addComponent(btnAnadirComida)
                                .addComponent(btnOrdenar)))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imagfruta)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(imagfruta3)
                                            .addComponent(imagfruta2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(chkFresas)
                                                    .addComponent(chkElote))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(chkNaranja)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(chkPlatano)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(chkMelon)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(chkManzana)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chkPapaya)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chkPera)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(chkPiña)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(chkGuayaba)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chkMoras)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(chkDurazno)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(Mango))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(4, 4, 4)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(chkLechuga)
                                                            .addComponent(btnLimpiar1))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(chkChampiñones))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(36, 36, 36)
                                                        .addComponent(chkChile)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(chkTomate)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(chkCebolla)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(chkBrocoli)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(chkAguacate))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(chkRes)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(chkPescado)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(chkAtun)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(chkCerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(chkPollo)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(chkMariscos)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chkPapa)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(chkCalabaza)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(chkZanahoria)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chkApio))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(imagfruta4)
                                .addGap(12, 12, 12)
                                .addComponent(chkPasta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkPan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkQuinoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkArroz)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkTrigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkMaiz)))
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkPeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPeraActionPerformed
        // TODO add your handling code her
        //nutri.Pera( 3.46f,  0f,  .91f, 7.33f, .96f, 3.75f, 29f, .13f, 5.8f, 1.67f, 2.31f, 5.78f);
    }//GEN-LAST:event_chkPeraActionPerformed

    private void chkGuayabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGuayabaActionPerformed
        // TODO add your handling code here:
       /* nutri = new Nutrientes();
        nutri.Guayaba( 3.88f,  0f,  1.74f, 18f, 1.7f, 7.5f, 72.5f, .25f, 14.5f, 2.5f, 21000f, 303.33f);*/
    }//GEN-LAST:event_chkGuayabaActionPerformed

    private void chkPapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPapaActionPerformed
        // TODO add your handling code here:
       // nutri = new Nutrientes();
        //nutri.Papa( 4.83f,  0f,  4.97f, 6.9f, .64f, 5.38f, 104.5f, .17f, 9.67f, 9.17f, 3.85f, 18.89f);
        
    }//GEN-LAST:event_chkPapaActionPerformed

    private void chkZanahoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkZanahoriaActionPerformed
        // TODO add your handling code here:
        //nutri = new Nutrientes();
        //nutri.Zanahoria( 1.55f,  0f,  1.43f, 2.07f, 2.7f, 6.25f, 54.75f, 3.25f, 48.56f, 5f, 4.62f, 4.22f);
        
    }//GEN-LAST:event_chkZanahoriaActionPerformed

    private void chkCebollaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCebollaActionPerformed
        // TODO add your handling code here:
        //nutri.Cebolla( 1.73f,  0f,  2.53f, 6f, 2.54f, 3.38f, 40.5f, .19f, .16f, 5.83f, 2.31f, 7.67f);
    }//GEN-LAST:event_chkCebollaActionPerformed

    private void chkChampiñonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkChampiñonesActionPerformed
        // TODO add your handling code here:
        //nutri.Champiñones( .18f,  0f,  9.02f, 7.2f, 1.08f, 12.5f, 97.5f, .49f, 0f, 8.33f, 23.85f, 4.44f);
        
    }//GEN-LAST:event_chkChampiñonesActionPerformed

    private void chkPolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPolloActionPerformed
       //nutri.Pollo(0f, 12f, 32.7f, 0f, 0f, 0.7f, 0f, 396f, 254f, 13f , 24.6f, 0f);
    }//GEN-LAST:event_chkPolloActionPerformed

    private void chkPescadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPescadoActionPerformed
        //nutri.Pescado(0.0f, 1.58f, 20.08f , 0.0f, 10.0f, 0.56f, 27.0f, 52.0f, 302.0f, 0.04f, 0.06f, 0.0f);
    }//GEN-LAST:event_chkPescadoActionPerformed

    
    private void chkCerdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCerdoActionPerformed
        //nutri.Puerco(0.0f, 2.1f, 36.64f, 0.0f, 0.0f, 0.9f, 13.0f, 515.0f, 470.0f, 0.79f, 0.2f, 0.0f);
    }//GEN-LAST:event_chkCerdoActionPerformed

    private void chkQuinoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkQuinoaActionPerformed
        //nutri.Quinoa(68.9f, 0.0f, 27.8f, 23.33f, 127.0f, 12.0f, 697.0f, 11.5f, 697.0f, 0.3f, 0.3f, 0.0f);
    }//GEN-LAST:event_chkQuinoaActionPerformed

    private void chkMaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMaizActionPerformed
        // TODO add your handling code here:
        //nutri.Maiz(5.94f,  0f,  7.04f, 10f, .3f, 7.5f, 50f, 19f, 2f, 3.33f, 6.15f, 1.11f);
    }//GEN-LAST:event_chkMaizActionPerformed

    private void chkPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPanActionPerformed
       // nutri.Pan(TOP_ALIGNMENT, TOP_ALIGNMENT, TOP_ALIGNMENT, TOP_ALIGNMENT, TOP_ALIGNMENT, TOP_ALIGNMENT, TOP_ALIGNMENT, TOP_ALIGNMENT, TOP_ALIGNMENT, TOP_ALIGNMENT, TOP_ALIGNMENT, TOP_ALIGNMENT);
    }//GEN-LAST:event_chkPanActionPerformed

    private void chkPastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPastaActionPerformed
        // TODO add your handling code here:
        //nutri.Pasta(23.15f,  0f,  27.12f, 11.8f, 2.4f, 22.5f, 59f, .44f, 0f, 7.5f, 4.62f, 0f);
    }//GEN-LAST:event_chkPastaActionPerformed

    private void chkGarbanzosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGarbanzosActionPerformed
       // nutri.Garbanzos(44.0f, 0.0f, 20.8f, 15.5f, 143.0f, 6.8f, 875.0f, 25.0f, 875.5f, 0.45f, 0.14f, 4.1f);
    }//GEN-LAST:event_chkGarbanzosActionPerformed

    private void chkFrijolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFrijolesActionPerformed
        //nutri.Frijoles(62.4f, 0.0f, 21.6f, 15.2f, 123.0f, 5.0f, 1483.0f, 5.0f, 1483.0f, 0.9f, 2.0f, 0.0f);
    }//GEN-LAST:event_chkFrijolesActionPerformed

    private void chkSoyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSoyaActionPerformed
        //nutri.Soya(6.29f, 0.0f, 34.74f, 22.0f, 201.0f, 6.6f, 1799.0f, 4.7f, 1799.0f, 0.61f, 0.27f, 3.0f);
    }//GEN-LAST:event_chkSoyaActionPerformed

    private void chkAlubiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAlubiasActionPerformed
       // nutri.Alubias(54.8f, 0.0f, 21.4f, 21.3f, 0.0f,6.2f, 163.0f, 0.0f, 1160.0f , 0.5f, 2.4f, 0.0f);
    }//GEN-LAST:event_chkAlubiasActionPerformed

    private void chkLentejasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLentejasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkLentejasActionPerformed

    private void chkLecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLecheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkLecheActionPerformed

    private void chkHuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkHuevoActionPerformed

    private void chkMielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMielActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMielActionPerformed

    private void chkQuesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkQuesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkQuesoActionPerformed

    private void chkPalomitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPalomitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPalomitasActionPerformed

    private void chkChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkChocolateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkChocolateActionPerformed

    private void chkGalletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGalletasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkGalletasActionPerformed

    private void chkCacahuatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCacahuatesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCacahuatesActionPerformed

    //Metodos para accesar a los componentes de la clase Comidas1
    private void añadirComidas (String alimento1 ){
        Comidas1.txaComida.setText(Comidas1.txaComida.getText()+alimento1+"\n");
    }
    
    private void añadirDesayunos (String alimento1 ){
        Comidas1.txaDes.setText(Comidas1.txaDes.getText()+alimento1+"\n");
    }
    
    private void añadirCena (String alimento1 ){
        Comidas1.txaCena.setText(Comidas1.txaCena.getText()+alimento1+"\n");
    }
    
    private void añadirSnack (String alimento1 ){
        Comidas1.txaSnack.setText(Comidas1.txaSnack.getText()+alimento1+"\n");
    }
            
    private void chkFresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFresasActionPerformed
      // TODO add your handling code here:
     // nutri.Fresas( 2.91f,  0f,  1.85f, 1.67f, 4.10f, 6.13f, 41.25f, .09f, 8.25f, 6.67f, 6.67f, 56.22f);
    }//GEN-LAST:event_chkFresasActionPerformed

    private void btnAnadirComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirComidaActionPerformed
        //frutas
        if (chkFresas.isSelected()){
            añadirComidas("Fresas");
            ListaPrin.lista1.add("Fresas", 2.91f,  0f,  1.85f, 1.67f, 4.10f, 6.13f, 41.25f, .09f, 8.25f, 6.67f, 6.67f, 56.22f);
            lista1.print();
        }
        
        if (chkNaranja.isSelected()){
            añadirComidas("Naranja");
         ListaPrin.lista1.add("Naranja",1.85f,  0f,  1.72f, 5.6f, 2.15f, 5.75f, 49.25f, .09f, 8.05f, 2.5f, 3.85f, 61.03f);
        }
        
        if (chkPlatano.isSelected()){
            añadirComidas("Platano");
           ListaPrin.lista1.add("Platano",6.67f,  0f,  2.25f, 8.5f, .73f, 7.38f, 92.5f, .06f, 18.5f, 4.17f, 5.38f, 12.78f);
        }
        
        if (chkMelon.isSelected()){
            añadirComidas("Melon");
           ListaPrin.lista1.add("Melon",4.05f,  0f,  1.87f, 2.43f, 1.56f, 4.38f, 77.5f, 1.06f, 15.5f, 4.17f, .77f, 35.67f);
        }
        
                
        if (chkManzana.isSelected()){
            añadirComidas("Manzana");
           ListaPrin.lista1.add("Manzana",3.72f,  0f,  .66f, 6.73f, .55f, 7f, 30f, .07f, 6f, 3.33f, 2.31f, 13.78f);
        }
           
           if (chkPapaya.isSelected()){
               añadirComidas("Papaya");
                ListaPrin.lista1.add("Papaya",3.2f,  0f,  1.27f, 6f, 2.4f, 1.25f, 64.25f, .19f, 12.85f, 2.25f, 2.46f, 68.67f);
        }
           
           if (chkPera.isSelected()){
               añadirComidas("Pera");
               ListaPrin.lista1.add("Pera",3.46f,  0f,  .91f, 7.33f, .96f, 3.75f, 29f, .13f, 5.8f, 1.67f, 2.31f, 5.78f);
        }
           
           if (chkPiña.isSelected()){
               añadirComidas("Piña");
                ListaPrin.lista1.add("Piña",3.4f,  0f,  .93f, 6.33f, 1.45f, 5.13f, 43.75f, .13f, 8.75f, 6.67f, 2.31f, 16.66f);
        }
           
           if (chkGuayaba.isSelected()){
               añadirComidas("Guayaba");
                ListaPrin.lista1.add("Guayaba",3.88f,  0f,  1.74f, 18f, 1.7f, 7.5f, 72.5f, .25f, 14.5f, 2.5f, 21000f, 303.33f);
        }
           
           if (chkMoras.isSelected()){
               añadirComidas("Moras");
                ListaPrin.lista1.add("Moras",2.04f,  0f,  2.53f, 10.53f, 4.4f, 11.25f, 47.5f, .15f, 9.5f, 2.5f, 3.08f, 18.89f);
        }
           
           if (chkDurazno.isSelected()){
               añadirComidas("Durazno");
                ListaPrin.lista1.add("Durazno",9.5f, 0f, 0.9f, 1.5f, 0f, 0f, 0f, 0f, 0.01f, 0f, 0f, 0f);
        }
           
           if (Mango.isSelected()){
               añadirComidas("Mango");
               ListaPrin.lista1.add("Mango",4.18f,  0f,  1.34f, 5.67f, 1.2f, 5f, 42.5f, .31f, 8.5f, 4.17f, 3.85f, 41.11f);
        }
           
        //Verduras
        if (chkElote.isSelected()){
               añadirComidas("Elote");
               ListaPrin.lista1.add("Elote",27.94f,  0f,  17.82f, 28.5f, 1.5f, 53.75f, 82.5f, .38f, 16.5f, 10.83f, 6.15f, 0f);
        }
        
        if (chkChile.isSelected()){
               añadirComidas("Chile");
               ListaPrin.lista1.add("Chile",0.85f,  0f,  1.7f, 6.33f, 3f, 15f, 55f, .44f, 11f, 5.83f, 6.15f, 133.33f);
        }
        
        if (chkTomate.isSelected()){
               añadirComidas("Tomate");
               ListaPrin.lista1.add("Tomate",1.14f,  0f,  1.87f, 4.67f, 1.06f, 8.75f, 60.5f, .56f, 20.54f, 5.83f, 0f, 29.56f);
        }
        
        if (chkCebolla.isSelected()){
               añadirComidas("Cebolla");
               ListaPrin.lista1.add("Cebolla",1.73f,  0f,  2.53f, 6f, 2.54f, 3.38f, 40.5f, .19f, .16f, 5.83f, 2.31f, 7.67f);
        }
        
        if (chkBrocoli.isSelected()){
               añadirComidas("Brocoli");
                ListaPrin.lista1.add("Brocoli",.87f,  0f,  7.55f, 10f, 5.8f, 10.75f, 69.75f, 1.38f, 15.89f, 7.5f, 13.85f, 111.11f);
        }
        
        if (chkAguacate.isSelected()){
               añadirComidas("Aguacate");
                ListaPrin.lista1.add("Aguacate",.13f,  0f,  3.99f, 21.1f, 1.2f, 6.13f, 121.75f, .29f, 1.33f, 6.67f, 6.15f, 6.67f);
        }
        
        if (chkPapa.isSelected()){
               añadirComidas("Papa");
                ListaPrin.lista1.add("Papa",4.83f,  0f,  4.97f, 6.9f, .64f, 5.38f, 104.5f, .17f, 9.67f, 9.17f, 3.85f, 18.89f);
        }
        
        if (chkCalabaza.isSelected()){
               añadirComidas("Calabaza");
                ListaPrin.lista1.add("Calabaza",1.5f,  0f,  2.4f, 7.2f, 2.2f, 10f, 76f, .19f, 14.18f, 4.17f, 5.38f, 13.33f);
        }
        
        if (chkZanahoria.isSelected()){
               añadirComidas("Zanahoria");
               ListaPrin.lista1.add("Zanahoria",1.55f,  0f,  1.43f, 2.07f, 2.7f, 6.25f, 54.75f, 3.25f, 48.56f, 5f, 4.62f, 4.22f);
        }
        
        if (chkApio.isSelected()){
               añadirComidas("Apio");
               ListaPrin.lista1.add("Apio",.81f,  0f,  2.53f, 4.67f, 4.1f, 5f, 80f, 6.25f, .92f, 4.17f, 6.15f, 4.44f);
        }
        
        if (chkLechuga.isSelected()){
               añadirComidas("Lechuga");
                ListaPrin.lista1.add("Lechuga",.46f,  0f,  2.91f, 5f, 3.47f, 12.5f, 55f, .19f, 20.78f, 5f, 5.38f, 14.44f);
        }
        
        if (chkChampiñones.isSelected()){
               añadirComidas("Champiñones");
                ListaPrin.lista1.add("Champiñones",.18f,  0f,  9.02f, 7.2f, 1.08f, 12.5f, 97.5f, .49f, 0f, 8.33f, 23.85f, 4.44f);
        }
        
        //Carnes
        if (chkRes.isSelected()){
               añadirComidas("Res");
              ListaPrin.lista1.add("Res",0.0f, 2.6f, 19.0f, 0.0f, 0.0f,2.6f, 21.0f, 72.0f, 318.0f, 0.05f, 0.14f, 0.0f);
        }
        
        if (chkPescado.isSelected()){
               añadirComidas("Pescado");
               ListaPrin.lista1.add("Pescado",0.0f, 1.58f, 20.08f , 0.0f, 10.0f, 0.56f, 27.0f, 52.0f, 302.0f, 0.04f, 0.06f, 0.0f);
        }
        
        if (chkAtun.isSelected()){
               añadirComidas("Atun");
              ListaPrin.lista1.add("Atun",0f, 0f, 18.9f, 0f, 0.01f, 0.08f, 0.02f, 0.3f, 0.1f, 0f, 0f, 0f);
        }
        if (chkCerdo.isSelected()){
               añadirComidas("Cerdo");
               ListaPrin.lista1.add("Cerdo",0.0f, 2.1f, 36.64f, 0.0f, 0.0f, 0.9f, 13.0f, 515.0f, 470.0f, 0.79f, 0.2f, 0.0f);
        }
        
        if (chkPollo.isSelected()){
               añadirComidas("Pollo");
              ListaPrin.lista1.add("Pollo",0f, 12f, 32.7f, 0f, 0f, 0.7f, 0f, 396f, 254f, 13f , 24.6f, 0f);
        }
        
        if (chkMariscos.isSelected()){
               añadirComidas("Mariscos");
              ListaPrin.lista1.add("Mariscos",0.0f,4.10f,18.1f,0.0f,80.0f,1.6f,36.0f,192.0f,254.0f,0.09f,0.0f,0.0f);
        }
        
        //Cereales
        if (chkPasta.isSelected()){
               añadirComidas("Pasta");
                ListaPrin.lista1.add("Pasta",23.15f,  0f,  27.12f, 11.8f, 2.4f, 22.5f, 59f, .44f, 0f, 7.5f, 4.62f, 0f);
        }
        
        if (chkPan.isSelected()){
               añadirComidas("Pan");
                ListaPrin.lista1.add("Pan",52f, 0f, 7.5f, 3.5f, 0.2f, 0.03f, 0.02f, 0.5f, 0.03f, 0f, 0f, 0f);
        }
        
        if (chkQuinoa.isSelected()){
               añadirComidas("Quinoa");
               ListaPrin.lista1.add("Quinoa",68.9f, 0.0f, 27.8f, 23.33f, 127.0f, 12.0f, 697.0f, 11.5f, 697.0f, 0.3f, 0.3f, 0.0f);
        }
        
        if (chkArroz.isSelected()){
               añadirComidas("Arroz");
               ListaPrin.lista1.add("Arroz",26.64f,  0f,  14.15f, 5.45f, 1.4f, 10f, 27.25f, .24f, 0f, 4.17f, 3.08f, 0f);
        }
        
        if (chkTrigo.isSelected()){
               añadirComidas("Trigo");
                ListaPrin.lista1.add("Trigo",9.99f,  0f,  60.69f, 49.65f, 4.9f, 106.25f, 248.25f, .31f, 1.14f, 166.67f, 55.38f, 0f);
        }
        
        if (chkMaiz.isSelected()){
               añadirComidas("Maiz");
               ListaPrin.lista1.add("Maiz",5.94f,  0f,  7.04f, 10f, .3f, 7.5f, 50f, 19f, 2f, 3.33f, 6.15f, 1.11f);
        }
        
        //Leguminosas
        if (chkFrijoles.isSelected()){
               añadirComidas("Frijoles");
               ListaPrin.lista1.add("Frijoles",62.4f, 0.0f, 21.6f, 15.2f, 123.0f, 5.0f, 1483.0f, 5.0f, 1483.0f, 0.9f, 2.0f, 0.0f);
        }
        
        if (chkSoya.isSelected()){
               añadirComidas("Soya");
                ListaPrin.lista1.add("Soya",6.29f, 0.0f, 34.74f, 22.0f, 201.0f, 6.6f, 1799.0f, 4.7f, 1799.0f, 0.61f, 0.27f, 3.0f);
        }
        
        if (chkAlubias.isSelected()){
               añadirComidas("Alubias");
               ListaPrin.lista1.add("Alubias",54.8f, 0.0f, 21.4f, 21.3f, 0.0f,6.2f, 163.0f, 0.0f, 1160.0f , 0.5f, 2.4f, 0.0f);
        }
        
        if (chkLentejas.isSelected()){
               añadirComidas("Lentejas");
                ListaPrin.lista1.add("Lentejas",19.5f, 0f, 9f, 7.9f, 0.01f, 0.03f, 0.03f, 0.2f, 0.3f, 0f, 0f, 0f);
        }
        
        if (chkHabas.isSelected()){
               añadirComidas("Habas");
              ListaPrin.lista1.add("Habas",19.6f, 0f, 7.6f, 5.4f, 0f, 0f, 0f, 0.1f, 0.02f, 0f, 0f, 0f);
        }
        
        if (chkEjotes.isSelected()){
               añadirComidas("Ejotes");
                ListaPrin.lista1.add("Ejotes",25f, 0f, 8.6f, 8.8f, 0f, 0f, 0f, 0.4f, 0.4f, 0f, 0f, 0f);
        }
        
        if (chkGarbanzos.isSelected()){
               añadirComidas("Garbanzos");
               ListaPrin.lista1.add("Garbanzos",44.0f, 0.0f, 20.8f, 15.5f, 143.0f, 6.8f, 875.0f, 25.0f, 875.5f, 0.45f, 0.14f, 4.1f);
        }
        
        if (chkCacahuates.isSelected()){
               añadirComidas("Cacahuates");
               ListaPrin.lista1.add("Cacahuates",4.6f, 0f, 8.4f, 2.8f, 0.01f, 0f, 0.05f, 0.1f, 0.02f, 0f, 0f, 0f);
        }
        
        //Otros
        if (chkLeche.isSelected()){
               añadirComidas("Leche");
               ListaPrin.lista1.add("Leche",4.8f, 0f, 3.1f, 0f, 0.1f, 0f, 0.01f, 0.1f, 0.1f, 0f, 0f, 0f);
        }
        
        if (chkHuevo.isSelected()){
               añadirComidas("Huevo");
              ListaPrin.lista1.add("Huevo",1.1f, 0f, 12.6f, 0f, 0.05f, 0f, 0f, 0.1f, 0.01f, 0f, 0f, 0f);
        }
        
        if (chkMiel.isSelected()){
               añadirComidas("Miel");
              ListaPrin.lista1.add("Miel",82.4f, 0f, 0.3f, 0.2f, 0f, 0f, 0f, 0.1f, 0.05f, 0f, 0f, 0f);
        }
        
        if (chkQueso.isSelected()){
               añadirComidas("Queso");
               ListaPrin.lista1.add("Queso",5.6f, 0f, 21.6f, 0f, 0.6f, 0f, 0.02f, 0.6f, 0.05f, 0f, 0f, 0f);
        }
        
        if (chkYogurt.isSelected()){
               añadirComidas("Yogurt");
              ListaPrin.lista1.add("Yogurt",11.4f, 0f, 8.5f, 0f, 0.02f, 0f, 0f, 0.1f, 0.03f, 0f, 0f, 0f);
        }
        
        //Snacks
        if (chkPalomitas.isSelected()){
               añadirComidas("Palomitas");
               ListaPrin.lista1.add("Palomitas",77.9f, 0f, 12.9f, 14.5f, 0f, 0.01f, 0.1f, 0.03f, 0f, 0f, 0f, 0f);
        }
        
        if (chkChocolate.isSelected()){
               añadirComidas("Chocolate");
               ListaPrin.lista1.add("Chocolate",76.4f, 0f, 2.4f, 1.7f, 0.04f, 0f, 0.03f, 0.1f, 0.01f, 0f, 0f, 0f);
        }
        
        if (chkGalletas.isSelected()){
               añadirComidas("Galletas");
              ListaPrin.lista1.add("Galletas",63.9f, 0f, 5.1f, 2.4f, 0.02f, 0f, 0f, 0.3f, 0.01f, 0f, 0f, 0f);
        }
    }//GEN-LAST:event_btnAnadirComidaActionPerformed

    private void btnAnadirSnackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirSnackActionPerformed
        //frutas
        if (chkFresas.isSelected()){
            añadirSnack("Fresas");
            ListaPrin.lista1.add("Fresas", 2.91f,  0f,  1.85f, 1.67f, 4.10f, 6.13f, 41.25f, .09f, 8.25f, 6.67f, 6.67f, 56.22f);
            lista1.print();
        }
        
        if (chkNaranja.isSelected()){
            añadirSnack("Naranja");
         ListaPrin.lista1.add("Naranja",1.85f,  0f,  1.72f, 5.6f, 2.15f, 5.75f, 49.25f, .09f, 8.05f, 2.5f, 3.85f, 61.03f);
        }
        
        if (chkPlatano.isSelected()){
            añadirSnack("Platano");
           ListaPrin.lista1.add("Platano",6.67f,  0f,  2.25f, 8.5f, .73f, 7.38f, 92.5f, .06f, 18.5f, 4.17f, 5.38f, 12.78f);
        }
        
        if (chkMelon.isSelected()){
            añadirSnack("Melon");
           ListaPrin.lista1.add("Melon",4.05f,  0f,  1.87f, 2.43f, 1.56f, 4.38f, 77.5f, 1.06f, 15.5f, 4.17f, .77f, 35.67f);
        }
        
                
        if (chkManzana.isSelected()){
            añadirSnack("Manzana");
           ListaPrin.lista1.add("Manzana",3.72f,  0f,  .66f, 6.73f, .55f, 7f, 30f, .07f, 6f, 3.33f, 2.31f, 13.78f);
        }
           
           if (chkPapaya.isSelected()){
               añadirSnack("Papaya");
                ListaPrin.lista1.add("Papaya",3.2f,  0f,  1.27f, 6f, 2.4f, 1.25f, 64.25f, .19f, 12.85f, 2.25f, 2.46f, 68.67f);
        }
           
           if (chkPera.isSelected()){
               añadirSnack("Pera");
               ListaPrin.lista1.add("Pera",3.46f,  0f,  .91f, 7.33f, .96f, 3.75f, 29f, .13f, 5.8f, 1.67f, 2.31f, 5.78f);
        }
           
           if (chkPiña.isSelected()){
               añadirSnack("Piña");
                ListaPrin.lista1.add("Piña",3.4f,  0f,  .93f, 6.33f, 1.45f, 5.13f, 43.75f, .13f, 8.75f, 6.67f, 2.31f, 16.66f);
        }
           
           if (chkGuayaba.isSelected()){
               añadirSnack("Guayaba");
                ListaPrin.lista1.add("Guayaba",3.88f,  0f,  1.74f, 18f, 1.7f, 7.5f, 72.5f, .25f, 14.5f, 2.5f, 21000f, 303.33f);
        }
           
           if (chkMoras.isSelected()){
               añadirSnack("Moras");
                ListaPrin.lista1.add("Moras",2.04f,  0f,  2.53f, 10.53f, 4.4f, 11.25f, 47.5f, .15f, 9.5f, 2.5f, 3.08f, 18.89f);
        }
           
           if (chkDurazno.isSelected()){
               añadirSnack("Durazno");
                ListaPrin.lista1.add("Durazno",9.5f, 0f, 0.9f, 1.5f, 0f, 0f, 0f, 0f, 0.01f, 0f, 0f, 0f);
        }
           
           if (Mango.isSelected()){
               añadirSnack("Mango");
               ListaPrin.lista1.add("Mango",4.18f,  0f,  1.34f, 5.67f, 1.2f, 5f, 42.5f, .31f, 8.5f, 4.17f, 3.85f, 41.11f);
        }
           
        //Verduras
        if (chkElote.isSelected()){
               añadirSnack("Elote");
               ListaPrin.lista1.add("Elote",27.94f,  0f,  17.82f, 28.5f, 1.5f, 53.75f, 82.5f, .38f, 16.5f, 10.83f, 6.15f, 0f);
        }
        
        if (chkChile.isSelected()){
               añadirSnack("Chile");
               ListaPrin.lista1.add("Chile",0.85f,  0f,  1.7f, 6.33f, 3f, 15f, 55f, .44f, 11f, 5.83f, 6.15f, 133.33f);
        }
        
        if (chkTomate.isSelected()){
               añadirSnack("Tomate");
               ListaPrin.lista1.add("Tomate",1.14f,  0f,  1.87f, 4.67f, 1.06f, 8.75f, 60.5f, .56f, 20.54f, 5.83f, 0f, 29.56f);
        }
        
        if (chkCebolla.isSelected()){
               añadirSnack("Cebolla");
               ListaPrin.lista1.add("Cebolla",1.73f,  0f,  2.53f, 6f, 2.54f, 3.38f, 40.5f, .19f, .16f, 5.83f, 2.31f, 7.67f);
        }
        
        if (chkBrocoli.isSelected()){
               añadirSnack("Brocoli");
                ListaPrin.lista1.add("Brocoli",.87f,  0f,  7.55f, 10f, 5.8f, 10.75f, 69.75f, 1.38f, 15.89f, 7.5f, 13.85f, 111.11f);
        }
        
        if (chkAguacate.isSelected()){
               añadirSnack("Aguacate");
                ListaPrin.lista1.add("Aguacate",.13f,  0f,  3.99f, 21.1f, 1.2f, 6.13f, 121.75f, .29f, 1.33f, 6.67f, 6.15f, 6.67f);
        }
        
        if (chkPapa.isSelected()){
               añadirSnack("Papa");
                ListaPrin.lista1.add("Papa",4.83f,  0f,  4.97f, 6.9f, .64f, 5.38f, 104.5f, .17f, 9.67f, 9.17f, 3.85f, 18.89f);
        }
        
        if (chkCalabaza.isSelected()){
               añadirSnack("Calabaza");
                ListaPrin.lista1.add("Calabaza",1.5f,  0f,  2.4f, 7.2f, 2.2f, 10f, 76f, .19f, 14.18f, 4.17f, 5.38f, 13.33f);
        }
        
        if (chkZanahoria.isSelected()){
               añadirSnack("Zanahoria");
               ListaPrin.lista1.add("Zanahoria",1.55f,  0f,  1.43f, 2.07f, 2.7f, 6.25f, 54.75f, 3.25f, 48.56f, 5f, 4.62f, 4.22f);
        }
        
        if (chkApio.isSelected()){
               añadirSnack("Apio");
               ListaPrin.lista1.add("Apio",.81f,  0f,  2.53f, 4.67f, 4.1f, 5f, 80f, 6.25f, .92f, 4.17f, 6.15f, 4.44f);
        }
        
        if (chkLechuga.isSelected()){
               añadirSnack("Lechuga");
                ListaPrin.lista1.add("Lechuga",.46f,  0f,  2.91f, 5f, 3.47f, 12.5f, 55f, .19f, 20.78f, 5f, 5.38f, 14.44f);
        }
        
        if (chkChampiñones.isSelected()){
               añadirSnack("Champiñones");
                ListaPrin.lista1.add("Champiñones",.18f,  0f,  9.02f, 7.2f, 1.08f, 12.5f, 97.5f, .49f, 0f, 8.33f, 23.85f, 4.44f);
        }
        
        //Carnes
        if (chkRes.isSelected()){
               añadirSnack("Res");
              ListaPrin.lista1.add("Res",0.0f, 2.6f, 19.0f, 0.0f, 0.0f,2.6f, 21.0f, 72.0f, 318.0f, 0.05f, 0.14f, 0.0f);
        }
        
        if (chkPescado.isSelected()){
               añadirSnack("Pescado");
               ListaPrin.lista1.add("Pescado",0.0f, 1.58f, 20.08f , 0.0f, 10.0f, 0.56f, 27.0f, 52.0f, 302.0f, 0.04f, 0.06f, 0.0f);
        }
        
        if (chkAtun.isSelected()){
               añadirSnack("Atun");
              ListaPrin.lista1.add("Atun",0f, 0f, 18.9f, 0f, 0.01f, 0.08f, 0.02f, 0.3f, 0.1f, 0f, 0f, 0f);
        }
        if (chkCerdo.isSelected()){
               añadirSnack("Cerdo");
               ListaPrin.lista1.add("Cerdo",0.0f, 2.1f, 36.64f, 0.0f, 0.0f, 0.9f, 13.0f, 515.0f, 470.0f, 0.79f, 0.2f, 0.0f);
        }
        
        if (chkPollo.isSelected()){
               añadirSnack("Pollo");
              ListaPrin.lista1.add("Pollo",0f, 12f, 32.7f, 0f, 0f, 0.7f, 0f, 396f, 254f, 13f , 24.6f, 0f);
        }
        
        if (chkMariscos.isSelected()){
               añadirSnack("Mariscos");
              ListaPrin.lista1.add("Mariscos",0.0f,4.10f,18.1f,0.0f,80.0f,1.6f,36.0f,192.0f,254.0f,0.09f,0.0f,0.0f);
        }
        
        //Cereales
        if (chkPasta.isSelected()){
               añadirSnack("Pasta");
                ListaPrin.lista1.add("Pasta",23.15f,  0f,  27.12f, 11.8f, 2.4f, 22.5f, 59f, .44f, 0f, 7.5f, 4.62f, 0f);
        }
        
        if (chkPan.isSelected()){
               añadirSnack("Pan");
                ListaPrin.lista1.add("Pan",52f, 0f, 7.5f, 3.5f, 0.2f, 0.03f, 0.02f, 0.5f, 0.03f, 0f, 0f, 0f);
        }
        
        if (chkQuinoa.isSelected()){
               añadirSnack("Quinoa");
               ListaPrin.lista1.add("Quinoa",68.9f, 0.0f, 27.8f, 23.33f, 127.0f, 12.0f, 697.0f, 11.5f, 697.0f, 0.3f, 0.3f, 0.0f);
        }
        
        if (chkArroz.isSelected()){
               añadirSnack("Arroz");
               ListaPrin.lista1.add("Arroz",26.64f,  0f,  14.15f, 5.45f, 1.4f, 10f, 27.25f, .24f, 0f, 4.17f, 3.08f, 0f);
        }
        
        if (chkTrigo.isSelected()){
               añadirSnack("Trigo");
                ListaPrin.lista1.add("Trigo",9.99f,  0f,  60.69f, 49.65f, 4.9f, 106.25f, 248.25f, .31f, 1.14f, 166.67f, 55.38f, 0f);
        }
        
        if (chkMaiz.isSelected()){
               añadirSnack("Maiz");
               ListaPrin.lista1.add("Maiz",5.94f,  0f,  7.04f, 10f, .3f, 7.5f, 50f, 19f, 2f, 3.33f, 6.15f, 1.11f);
        }
        
        //Leguminosas
        if (chkFrijoles.isSelected()){
               añadirSnack("Frijoles");
               ListaPrin.lista1.add("Frijoles",62.4f, 0.0f, 21.6f, 15.2f, 123.0f, 5.0f, 1483.0f, 5.0f, 1483.0f, 0.9f, 2.0f, 0.0f);
        }
        
        if (chkSoya.isSelected()){
               añadirSnack("Soya");
                ListaPrin.lista1.add("Soya",6.29f, 0.0f, 34.74f, 22.0f, 201.0f, 6.6f, 1799.0f, 4.7f, 1799.0f, 0.61f, 0.27f, 3.0f);
        }
        
        if (chkAlubias.isSelected()){
               añadirSnack("Alubias");
               ListaPrin.lista1.add("Alubias",54.8f, 0.0f, 21.4f, 21.3f, 0.0f,6.2f, 163.0f, 0.0f, 1160.0f , 0.5f, 2.4f, 0.0f);
        }
        
        if (chkLentejas.isSelected()){
               añadirSnack("Lentejas");
                ListaPrin.lista1.add("Lentejas",19.5f, 0f, 9f, 7.9f, 0.01f, 0.03f, 0.03f, 0.2f, 0.3f, 0f, 0f, 0f);
        }
        
        if (chkHabas.isSelected()){
               añadirSnack("Habas");
              ListaPrin.lista1.add("Habas",19.6f, 0f, 7.6f, 5.4f, 0f, 0f, 0f, 0.1f, 0.02f, 0f, 0f, 0f);
        }
        
        if (chkEjotes.isSelected()){
               añadirSnack("Ejotes");
                ListaPrin.lista1.add("Ejotes",25f, 0f, 8.6f, 8.8f, 0f, 0f, 0f, 0.4f, 0.4f, 0f, 0f, 0f);
        }
        
        if (chkGarbanzos.isSelected()){
               añadirSnack("Garbanzos");
               ListaPrin.lista1.add("Garbanzos",44.0f, 0.0f, 20.8f, 15.5f, 143.0f, 6.8f, 875.0f, 25.0f, 875.5f, 0.45f, 0.14f, 4.1f);
        }
        
        if (chkCacahuates.isSelected()){
               añadirSnack("Cacahuates");
               ListaPrin.lista1.add("Cacahuates",4.6f, 0f, 8.4f, 2.8f, 0.01f, 0f, 0.05f, 0.1f, 0.02f, 0f, 0f, 0f);
        }
        
        //Otros
        if (chkLeche.isSelected()){
               añadirSnack("Leche");
               ListaPrin.lista1.add("Leche",4.8f, 0f, 3.1f, 0f, 0.1f, 0f, 0.01f, 0.1f, 0.1f, 0f, 0f, 0f);
        }
        
        if (chkHuevo.isSelected()){
               añadirSnack("Huevo");
              ListaPrin.lista1.add("Huevo",1.1f, 0f, 12.6f, 0f, 0.05f, 0f, 0f, 0.1f, 0.01f, 0f, 0f, 0f);
        }
        
        if (chkMiel.isSelected()){
               añadirSnack("Miel");
              ListaPrin.lista1.add("Miel",82.4f, 0f, 0.3f, 0.2f, 0f, 0f, 0f, 0.1f, 0.05f, 0f, 0f, 0f);
        }
        
        if (chkQueso.isSelected()){
               añadirSnack("Queso");
               ListaPrin.lista1.add("Queso",5.6f, 0f, 21.6f, 0f, 0.6f, 0f, 0.02f, 0.6f, 0.05f, 0f, 0f, 0f);
        }
        
        if (chkYogurt.isSelected()){
               añadirSnack("Yogurt");
              ListaPrin.lista1.add("Yogurt",11.4f, 0f, 8.5f, 0f, 0.02f, 0f, 0f, 0.1f, 0.03f, 0f, 0f, 0f);
        }
        
        //Snacks
        if (chkPalomitas.isSelected()){
               añadirSnack("Palomitas");
               ListaPrin.lista1.add("Palomitas",77.9f, 0f, 12.9f, 14.5f, 0f, 0.01f, 0.1f, 0.03f, 0f, 0f, 0f, 0f);
        }
        
        if (chkChocolate.isSelected()){
               añadirSnack("Chocolate");
               ListaPrin.lista1.add("Chocolate",76.4f, 0f, 2.4f, 1.7f, 0.04f, 0f, 0.03f, 0.1f, 0.01f, 0f, 0f, 0f);
        }
        
        if (chkGalletas.isSelected()){
               añadirSnack("Galletas");
              ListaPrin.lista1.add("Galletas",63.9f, 0f, 5.1f, 2.4f, 0.02f, 0f, 0f, 0.3f, 0.01f, 0f, 0f, 0f);
        }
    }//GEN-LAST:event_btnAnadirSnackActionPerformed

    private void btnAnadircenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadircenaActionPerformed
     //frutas
        if (chkFresas.isSelected()){
            añadirCena("Fresas");
            ListaPrin.lista1.add("Fresas", 2.91f,  0f,  1.85f, 1.67f, 4.10f, 6.13f, 41.25f, .09f, 8.25f, 6.67f, 6.67f, 56.22f);
            lista1.print();
        }
        
        if (chkNaranja.isSelected()){
            añadirCena("Naranja");
         ListaPrin.lista1.add("Naranja",1.85f,  0f,  1.72f, 5.6f, 2.15f, 5.75f, 49.25f, .09f, 8.05f, 2.5f, 3.85f, 61.03f);
        }
        
        if (chkPlatano.isSelected()){
            añadirCena("Platano");
           ListaPrin.lista1.add("Platano",6.67f,  0f,  2.25f, 8.5f, .73f, 7.38f, 92.5f, .06f, 18.5f, 4.17f, 5.38f, 12.78f);
        }
        
        if (chkMelon.isSelected()){
            añadirCena("Melon");
           ListaPrin.lista1.add("Melon",4.05f,  0f,  1.87f, 2.43f, 1.56f, 4.38f, 77.5f, 1.06f, 15.5f, 4.17f, .77f, 35.67f);
        }
        
                
        if (chkManzana.isSelected()){
            añadirCena("Manzana");
           ListaPrin.lista1.add("Manzana",3.72f,  0f,  .66f, 6.73f, .55f, 7f, 30f, .07f, 6f, 3.33f, 2.31f, 13.78f);
        }
           
           if (chkPapaya.isSelected()){
               añadirCena("Papaya");
                ListaPrin.lista1.add("Papaya",3.2f,  0f,  1.27f, 6f, 2.4f, 1.25f, 64.25f, .19f, 12.85f, 2.25f, 2.46f, 68.67f);
        }
           
           if (chkPera.isSelected()){
               añadirCena("Pera");
               ListaPrin.lista1.add("Pera",3.46f,  0f,  .91f, 7.33f, .96f, 3.75f, 29f, .13f, 5.8f, 1.67f, 2.31f, 5.78f);
        }
           
           if (chkPiña.isSelected()){
               añadirCena("Piña");
                ListaPrin.lista1.add("Piña",3.4f,  0f,  .93f, 6.33f, 1.45f, 5.13f, 43.75f, .13f, 8.75f, 6.67f, 2.31f, 16.66f);
        }
           
           if (chkGuayaba.isSelected()){
               añadirCena("Guayaba");
                ListaPrin.lista1.add("Guayaba",3.88f,  0f,  1.74f, 18f, 1.7f, 7.5f, 72.5f, .25f, 14.5f, 2.5f, 21000f, 303.33f);
        }
           
           if (chkMoras.isSelected()){
               añadirCena("Moras");
                ListaPrin.lista1.add("Moras",2.04f,  0f,  2.53f, 10.53f, 4.4f, 11.25f, 47.5f, .15f, 9.5f, 2.5f, 3.08f, 18.89f);
        }
           
           if (chkDurazno.isSelected()){
               añadirCena("Durazno");
                ListaPrin.lista1.add("Durazno",9.5f, 0f, 0.9f, 1.5f, 0f, 0f, 0f, 0f, 0.01f, 0f, 0f, 0f);
        }
           
           if (Mango.isSelected()){
               añadirCena("Mango");
               ListaPrin.lista1.add("Mango",4.18f,  0f,  1.34f, 5.67f, 1.2f, 5f, 42.5f, .31f, 8.5f, 4.17f, 3.85f, 41.11f);
        }
           
        //Verduras
        if (chkElote.isSelected()){
               añadirCena("Elote");
               ListaPrin.lista1.add("Elote",27.94f,  0f,  17.82f, 28.5f, 1.5f, 53.75f, 82.5f, .38f, 16.5f, 10.83f, 6.15f, 0f);
        }
        
        if (chkChile.isSelected()){
               añadirCena("Chile");
               ListaPrin.lista1.add("Chile",0.85f,  0f,  1.7f, 6.33f, 3f, 15f, 55f, .44f, 11f, 5.83f, 6.15f, 133.33f);
        }
        
        if (chkTomate.isSelected()){
               añadirCena("Tomate");
               ListaPrin.lista1.add("Tomate",1.14f,  0f,  1.87f, 4.67f, 1.06f, 8.75f, 60.5f, .56f, 20.54f, 5.83f, 0f, 29.56f);
        }
        
        if (chkCebolla.isSelected()){
               añadirCena("Cebolla");
               ListaPrin.lista1.add("Cebolla",1.73f,  0f,  2.53f, 6f, 2.54f, 3.38f, 40.5f, .19f, .16f, 5.83f, 2.31f, 7.67f);
        }
        
        if (chkBrocoli.isSelected()){
               añadirCena("Brocoli");
                ListaPrin.lista1.add("Brocoli",.87f,  0f,  7.55f, 10f, 5.8f, 10.75f, 69.75f, 1.38f, 15.89f, 7.5f, 13.85f, 111.11f);
        }
        
        if (chkAguacate.isSelected()){
               añadirCena("Aguacate");
                ListaPrin.lista1.add("Aguacate",.13f,  0f,  3.99f, 21.1f, 1.2f, 6.13f, 121.75f, .29f, 1.33f, 6.67f, 6.15f, 6.67f);
        }
        
        if (chkPapa.isSelected()){
               añadirCena("Papa");
                ListaPrin.lista1.add("Papa",4.83f,  0f,  4.97f, 6.9f, .64f, 5.38f, 104.5f, .17f, 9.67f, 9.17f, 3.85f, 18.89f);
        }
        
        if (chkCalabaza.isSelected()){
               añadirCena("Calabaza");
                ListaPrin.lista1.add("Calabaza",1.5f,  0f,  2.4f, 7.2f, 2.2f, 10f, 76f, .19f, 14.18f, 4.17f, 5.38f, 13.33f);
        }
        
        if (chkZanahoria.isSelected()){
               añadirCena("Zanahoria");
               ListaPrin.lista1.add("Zanahoria",1.55f,  0f,  1.43f, 2.07f, 2.7f, 6.25f, 54.75f, 3.25f, 48.56f, 5f, 4.62f, 4.22f);
        }
        
        if (chkApio.isSelected()){
               añadirCena("Apio");
               ListaPrin.lista1.add("Apio",.81f,  0f,  2.53f, 4.67f, 4.1f, 5f, 80f, 6.25f, .92f, 4.17f, 6.15f, 4.44f);
        }
        
        if (chkLechuga.isSelected()){
               añadirCena("Lechuga");
                ListaPrin.lista1.add("Lechuga",.46f,  0f,  2.91f, 5f, 3.47f, 12.5f, 55f, .19f, 20.78f, 5f, 5.38f, 14.44f);
        }
        
        if (chkChampiñones.isSelected()){
               añadirCena("Champiñones");
                ListaPrin.lista1.add("Champiñones",.18f,  0f,  9.02f, 7.2f, 1.08f, 12.5f, 97.5f, .49f, 0f, 8.33f, 23.85f, 4.44f);
        }
        
        //Carnes
        if (chkRes.isSelected()){
               añadirCena("Res");
              ListaPrin.lista1.add("Res",0.0f, 2.6f, 19.0f, 0.0f, 0.0f,2.6f, 21.0f, 72.0f, 318.0f, 0.05f, 0.14f, 0.0f);
        }
        
        if (chkPescado.isSelected()){
               añadirCena("Pescado");
               ListaPrin.lista1.add("Pescado",0.0f, 1.58f, 20.08f , 0.0f, 10.0f, 0.56f, 27.0f, 52.0f, 302.0f, 0.04f, 0.06f, 0.0f);
        }
        
        if (chkAtun.isSelected()){
               añadirCena("Atun");
              ListaPrin.lista1.add("Atun",0f, 0f, 18.9f, 0f, 0.01f, 0.08f, 0.02f, 0.3f, 0.1f, 0f, 0f, 0f);
        }
        if (chkCerdo.isSelected()){
               añadirCena("Cerdo");
               ListaPrin.lista1.add("Cerdo",0.0f, 2.1f, 36.64f, 0.0f, 0.0f, 0.9f, 13.0f, 515.0f, 470.0f, 0.79f, 0.2f, 0.0f);
        }
        
        if (chkPollo.isSelected()){
               añadirCena("Pollo");
              ListaPrin.lista1.add("Pollo",0f, 12f, 32.7f, 0f, 0f, 0.7f, 0f, 396f, 254f, 13f , 24.6f, 0f);
        }
        
        if (chkMariscos.isSelected()){
               añadirCena("Mariscos");
              ListaPrin.lista1.add("Mariscos",0.0f,4.10f,18.1f,0.0f,80.0f,1.6f,36.0f,192.0f,254.0f,0.09f,0.0f,0.0f);
        }
        
        //Cereales
        if (chkPasta.isSelected()){
               añadirCena("Pasta");
                ListaPrin.lista1.add("Pasta",23.15f,  0f,  27.12f, 11.8f, 2.4f, 22.5f, 59f, .44f, 0f, 7.5f, 4.62f, 0f);
        }
        
        if (chkPan.isSelected()){
               añadirCena("Pan");
                ListaPrin.lista1.add("Pan",52f, 0f, 7.5f, 3.5f, 0.2f, 0.03f, 0.02f, 0.5f, 0.03f, 0f, 0f, 0f);
        }
        
        if (chkQuinoa.isSelected()){
               añadirCena("Quinoa");
               ListaPrin.lista1.add("Quinoa",68.9f, 0.0f, 27.8f, 23.33f, 127.0f, 12.0f, 697.0f, 11.5f, 697.0f, 0.3f, 0.3f, 0.0f);
        }
        
        if (chkArroz.isSelected()){
               añadirCena("Arroz");
               ListaPrin.lista1.add("Arroz",26.64f,  0f,  14.15f, 5.45f, 1.4f, 10f, 27.25f, .24f, 0f, 4.17f, 3.08f, 0f);
        }
        
        if (chkTrigo.isSelected()){
               añadirCena("Trigo");
                ListaPrin.lista1.add("Trigo",9.99f,  0f,  60.69f, 49.65f, 4.9f, 106.25f, 248.25f, .31f, 1.14f, 166.67f, 55.38f, 0f);
        }
        
        if (chkMaiz.isSelected()){
               añadirCena("Maiz");
               ListaPrin.lista1.add("Maiz",5.94f,  0f,  7.04f, 10f, .3f, 7.5f, 50f, 19f, 2f, 3.33f, 6.15f, 1.11f);
        }
        
        //Leguminosas
        if (chkFrijoles.isSelected()){
               añadirCena("Frijoles");
               ListaPrin.lista1.add("Frijoles",62.4f, 0.0f, 21.6f, 15.2f, 123.0f, 5.0f, 1483.0f, 5.0f, 1483.0f, 0.9f, 2.0f, 0.0f);
        }
        
        if (chkSoya.isSelected()){
               añadirCena("Soya");
                ListaPrin.lista1.add("Soya",6.29f, 0.0f, 34.74f, 22.0f, 201.0f, 6.6f, 1799.0f, 4.7f, 1799.0f, 0.61f, 0.27f, 3.0f);
        }
        
        if (chkAlubias.isSelected()){
               añadirCena("Alubias");
               ListaPrin.lista1.add("Alubias",54.8f, 0.0f, 21.4f, 21.3f, 0.0f,6.2f, 163.0f, 0.0f, 1160.0f , 0.5f, 2.4f, 0.0f);
        }
        
        if (chkLentejas.isSelected()){
               añadirCena("Lentejas");
                ListaPrin.lista1.add("Lentejas",19.5f, 0f, 9f, 7.9f, 0.01f, 0.03f, 0.03f, 0.2f, 0.3f, 0f, 0f, 0f);
        }
        
        if (chkHabas.isSelected()){
               añadirCena("Habas");
              ListaPrin.lista1.add("Habas",19.6f, 0f, 7.6f, 5.4f, 0f, 0f, 0f, 0.1f, 0.02f, 0f, 0f, 0f);
        }
        
        if (chkEjotes.isSelected()){
               añadirCena("Ejotes");
                ListaPrin.lista1.add("Ejotes",25f, 0f, 8.6f, 8.8f, 0f, 0f, 0f, 0.4f, 0.4f, 0f, 0f, 0f);
        }
        
        if (chkGarbanzos.isSelected()){
               añadirCena("Garbanzos");
               ListaPrin.lista1.add("Garbanzos",44.0f, 0.0f, 20.8f, 15.5f, 143.0f, 6.8f, 875.0f, 25.0f, 875.5f, 0.45f, 0.14f, 4.1f);
        }
        
        if (chkCacahuates.isSelected()){
               añadirCena("Cacahuates");
               ListaPrin.lista1.add("Cacahuates",4.6f, 0f, 8.4f, 2.8f, 0.01f, 0f, 0.05f, 0.1f, 0.02f, 0f, 0f, 0f);
        }
        
        //Otros
        if (chkLeche.isSelected()){
               añadirCena("Leche");
               ListaPrin.lista1.add("Leche",4.8f, 0f, 3.1f, 0f, 0.1f, 0f, 0.01f, 0.1f, 0.1f, 0f, 0f, 0f);
        }
        
        if (chkHuevo.isSelected()){
               añadirCena("Huevo");
              ListaPrin.lista1.add("Huevo",1.1f, 0f, 12.6f, 0f, 0.05f, 0f, 0f, 0.1f, 0.01f, 0f, 0f, 0f);
        }
        
        if (chkMiel.isSelected()){
               añadirCena("Miel");
              ListaPrin.lista1.add("Miel",82.4f, 0f, 0.3f, 0.2f, 0f, 0f, 0f, 0.1f, 0.05f, 0f, 0f, 0f);
        }
        
        if (chkQueso.isSelected()){
               añadirCena("Queso");
               ListaPrin.lista1.add("Queso",5.6f, 0f, 21.6f, 0f, 0.6f, 0f, 0.02f, 0.6f, 0.05f, 0f, 0f, 0f);
        }
        
        if (chkYogurt.isSelected()){
               añadirCena("Yogurt");
              ListaPrin.lista1.add("Yogurt",11.4f, 0f, 8.5f, 0f, 0.02f, 0f, 0f, 0.1f, 0.03f, 0f, 0f, 0f);
        }
        
        //Snacks
        if (chkPalomitas.isSelected()){
               añadirCena("Palomitas");
               ListaPrin.lista1.add("Palomitas",77.9f, 0f, 12.9f, 14.5f, 0f, 0.01f, 0.1f, 0.03f, 0f, 0f, 0f, 0f);
        }
        
        if (chkChocolate.isSelected()){
               añadirCena("Chocolate");
               ListaPrin.lista1.add("Chocolate",76.4f, 0f, 2.4f, 1.7f, 0.04f, 0f, 0.03f, 0.1f, 0.01f, 0f, 0f, 0f);
        }
        
        if (chkGalletas.isSelected()){
               añadirCena("Galletas");
              ListaPrin.lista1.add("Galletas",63.9f, 0f, 5.1f, 2.4f, 0.02f, 0f, 0f, 0.3f, 0.01f, 0f, 0f, 0f);
        }
    }//GEN-LAST:event_btnAnadircenaActionPerformed

    private void chkNaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNaranjaActionPerformed
        // TODO add your handling code here:
      //  nutri.Naranja( 1.85f,  0f,  1.72f, 5.6f, 2.15f, 5.75f, 49.25f, .09f, 8.05f, 2.5f, 3.85f, 61.03f);
    }//GEN-LAST:event_chkNaranjaActionPerformed

    private void chkPlatanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPlatanoActionPerformed
        // TODO add your handling code here:
        //nutri.Platano( 6.67f,  0f,  2.25f, 8.5f, .73f, 7.38f, 92.5f, .06f, 18.5f, 4.17f, 5.38f, 12.78f);
    }//GEN-LAST:event_chkPlatanoActionPerformed

    private void chkMelonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMelonActionPerformed
        // TODO add your handling code here:
        //nutri.Melon( 4.05f,  0f,  1.87f, 2.43f, 1.56f, 4.38f, 77.5f, 1.06f, 15.5f, 4.17f, .77f, 35.67f);
    }//GEN-LAST:event_chkMelonActionPerformed

    private void chkManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkManzanaActionPerformed
        // TODO add your handling code here:
        //nutri.Manzana( 3.72f,  0f,  .66f, 6.73f, .55f, 7f, 30f, .07f, 6f, 3.33f, 2.31f, 13.78f);
    }//GEN-LAST:event_chkManzanaActionPerformed

    private void chkPapayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPapayaActionPerformed
        // TODO add your handling code here:
       // nutri.Papaya( 3.2f,  0f,  1.27f, 6f, 2.4f, 1.25f, 64.25f, .19f, 12.85f, 2.25f, 2.46f, 68.67f);
    }//GEN-LAST:event_chkPapayaActionPerformed

    private void chkPiñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPiñaActionPerformed
        // TODO add your handling code here:
        //nutri.Piña( 3.4f,  0f,  .93f, 6.33f, 1.45f, 5.13f, 43.75f, .13f, 8.75f, 6.67f, 2.31f, 16.66f);
    }//GEN-LAST:event_chkPiñaActionPerformed

    private void chkMorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMorasActionPerformed
        // TODO add your handling code here:
       // nutri.Moras( 2.04f,  0f,  2.53f, 10.53f, 4.4f, 11.25f, 47.5f, .15f, 9.5f, 2.5f, 3.08f, 18.89f);
    }//GEN-LAST:event_chkMorasActionPerformed

    private void MangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MangoActionPerformed
        // TODO add your handling code here:
       // nutri.Mango( 4.18f,  0f,  1.34f, 5.67f, 1.2f, 5f, 42.5f, .31f, 8.5f, 4.17f, 3.85f, 41.11f);
    }//GEN-LAST:event_MangoActionPerformed

    private void chkEloteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEloteActionPerformed
        // TODO add your handling code here:
       // nutri.Elote( 27.94f,  0f,  17.82f, 28.5f, 1.5f, 53.75f, 82.5f, .38f, 16.5f, 10.83f, 6.15f, 0f);
    }//GEN-LAST:event_chkEloteActionPerformed

    private void chkChileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkChileActionPerformed
        // TODO add your handling code here:
        //nutri.Chile( .85f,  0f,  1.7f, 6.33f, 3f, 15f, 55f, .44f, 11f, 5.83f, 6.15f, 133.33f);
    }//GEN-LAST:event_chkChileActionPerformed

    private void chkTomateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTomateActionPerformed
        // TODO add your handling code here:
       // nutri.Tomate( 1.14f,  0f,  1.87f, 4.67f, 1.06f, 8.75f, 60.5f, .56f, 20.54f, 5.83f, 0f, 29.56f);
    }//GEN-LAST:event_chkTomateActionPerformed

    private void chkBrocoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBrocoliActionPerformed
        // TODO add your handling code here:
        //nutri.Brocoli( .87f,  0f,  7.55f, 10f, 5.8f, 10.75f, 69.75f, 1.38f, 15.89f, 7.5f, 13.85f, 111.11f);
    }//GEN-LAST:event_chkBrocoliActionPerformed

    private void chkAguacateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAguacateActionPerformed
        // TODO add your handling code here:
        //nutri.Aguacate( .13f,  0f,  3.99f, 21.1f, 1.2f, 6.13f, 121.75f, .29f, 1.33f, 6.67f, 6.15f, 6.67f);
    }//GEN-LAST:event_chkAguacateActionPerformed

    private void chkCalabazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCalabazaActionPerformed
        // TODO add your handling code here
        //nutri.Calabaza( 1.5f,  0f,  2.4f, 7.2f, 2.2f, 10f, 76f, .19f, 14.18f, 4.17f, 5.38f, 13.33f);
    }//GEN-LAST:event_chkCalabazaActionPerformed

    private void chkApioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApioActionPerformed
        // TODO add your handling code here:
        //nutri.Apio( .81f,  0f,  2.53f, 4.67f, 4.1f, 5f, 80f, 6.25f, .92f, 4.17f, 6.15f, 4.44f);
    }//GEN-LAST:event_chkApioActionPerformed

    private void chkLechugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLechugaActionPerformed
        // TODO add your handling code here:
        //nutri.Lechuga( .46f,  0f,  2.91f, 5f, 3.47f, 12.5f, 55f, .19f, 20.78f, 5f, 5.38f, 14.44f);
    }//GEN-LAST:event_chkLechugaActionPerformed

    private void chkResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkResActionPerformed
       // nutri.Res(0.0f, 2.6f, 19.0f, 0.0f, 0.0f,2.6f, 21.0f, 72.0f, 318.0f, 0.05f, 0.14f, 0.0f);
    }//GEN-LAST:event_chkResActionPerformed

    private void chkArrozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkArrozActionPerformed
        // TODO add your handling code here:
       // nutri.Arroz(26.64f,  0f,  14.15f, 5.45f, 1.4f, 10f, 27.25f, .24f, 0f, 4.17f, 3.08f, 0f);
    }//GEN-LAST:event_chkArrozActionPerformed

    private void chkTrigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTrigoActionPerformed
        // TODO add your handling code here:
      //nutri.Trigo(9.99f,  0f,  60.69f, 49.65f, 4.9f, 106.25f, 248.25f, .31f, 1.14f, 166.67f, 55.38f, 0f);
    }//GEN-LAST:event_chkTrigoActionPerformed

    private void chkMariscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMariscosActionPerformed
       // nutri.Mariscos(0.0f,4.10f,18.1f,0.0f,80.0f,1.6f,36.0f,192.0f,254.0f,0.09f,0.0f,0.0f);
    }//GEN-LAST:event_chkMariscosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false); 
        //new Comidas1().setVisible(true);

    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAnadirDes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirDes2ActionPerformed
       //frutas
        if (chkFresas.isSelected()){
            añadirDesayunos("Fresas");
            ListaPrin.lista1.add("Fresas", 2.91f,  0f,  1.85f, 1.67f, 4.10f, 6.13f, 41.25f, .09f, 8.25f, 6.67f, 6.67f, 56.22f);
            lista1.print();
        }
        
        if (chkNaranja.isSelected()){
            añadirDesayunos("Naranja");
         ListaPrin.lista1.add("Naranja",1.85f,  0f,  1.72f, 5.6f, 2.15f, 5.75f, 49.25f, .09f, 8.05f, 2.5f, 3.85f, 61.03f);
        }
        
        if (chkPlatano.isSelected()){
            añadirDesayunos("Platano");
           ListaPrin.lista1.add("Platano",6.67f,  0f,  2.25f, 8.5f, .73f, 7.38f, 92.5f, .06f, 18.5f, 4.17f, 5.38f, 12.78f);
        }
        
        if (chkMelon.isSelected()){
            añadirDesayunos("Melon");
           ListaPrin.lista1.add("Melon",4.05f,  0f,  1.87f, 2.43f, 1.56f, 4.38f, 77.5f, 1.06f, 15.5f, 4.17f, .77f, 35.67f);
        }
        
                
        if (chkManzana.isSelected()){
            añadirDesayunos("Manzana");
           ListaPrin.lista1.add("Manzana",3.72f,  0f,  .66f, 6.73f, .55f, 7f, 30f, .07f, 6f, 3.33f, 2.31f, 13.78f);
        }
           
           if (chkPapaya.isSelected()){
               añadirDesayunos("Papaya");
                ListaPrin.lista1.add("Papaya",3.2f,  0f,  1.27f, 6f, 2.4f, 1.25f, 64.25f, .19f, 12.85f, 2.25f, 2.46f, 68.67f);
        }
           
           if (chkPera.isSelected()){
               añadirDesayunos("Pera");
               ListaPrin.lista1.add("Pera",3.46f,  0f,  .91f, 7.33f, .96f, 3.75f, 29f, .13f, 5.8f, 1.67f, 2.31f, 5.78f);
        }
           
           if (chkPiña.isSelected()){
               añadirDesayunos("Piña");
                ListaPrin.lista1.add("Piña",3.4f,  0f,  .93f, 6.33f, 1.45f, 5.13f, 43.75f, .13f, 8.75f, 6.67f, 2.31f, 16.66f);
        }
           
           if (chkGuayaba.isSelected()){
               añadirDesayunos("Guayaba");
                ListaPrin.lista1.add("Guayaba",3.88f,  0f,  1.74f, 18f, 1.7f, 7.5f, 72.5f, .25f, 14.5f, 2.5f, 21000f, 303.33f);
        }
           
           if (chkMoras.isSelected()){
               añadirDesayunos("Moras");
                ListaPrin.lista1.add("Moras",2.04f,  0f,  2.53f, 10.53f, 4.4f, 11.25f, 47.5f, .15f, 9.5f, 2.5f, 3.08f, 18.89f);
        }
           
           if (chkDurazno.isSelected()){
               añadirDesayunos("Durazno");
                ListaPrin.lista1.add("Durazno",9.5f, 0f, 0.9f, 1.5f, 0f, 0f, 0f, 0f, 0.01f, 0f, 0f, 0f);
        }
           
           if (Mango.isSelected()){
               añadirDesayunos("Mango");
               ListaPrin.lista1.add("Mango",4.18f,  0f,  1.34f, 5.67f, 1.2f, 5f, 42.5f, .31f, 8.5f, 4.17f, 3.85f, 41.11f);
        }
           
        //Verduras
        if (chkElote.isSelected()){
               añadirDesayunos("Elote");
               ListaPrin.lista1.add("Elote",27.94f,  0f,  17.82f, 28.5f, 1.5f, 53.75f, 82.5f, .38f, 16.5f, 10.83f, 6.15f, 0f);
        }
        
        if (chkChile.isSelected()){
               añadirDesayunos("Chile");
               ListaPrin.lista1.add("Chile",0.85f,  0f,  1.7f, 6.33f, 3f, 15f, 55f, .44f, 11f, 5.83f, 6.15f, 133.33f);
        }
        
        if (chkTomate.isSelected()){
               añadirDesayunos("Tomate");
               ListaPrin.lista1.add("Tomate",1.14f,  0f,  1.87f, 4.67f, 1.06f, 8.75f, 60.5f, .56f, 20.54f, 5.83f, 0f, 29.56f);
        }
        
        if (chkCebolla.isSelected()){
               añadirDesayunos("Cebolla");
               ListaPrin.lista1.add("Cebolla",1.73f,  0f,  2.53f, 6f, 2.54f, 3.38f, 40.5f, .19f, .16f, 5.83f, 2.31f, 7.67f);
        }
        
        if (chkBrocoli.isSelected()){
               añadirDesayunos("Brocoli");
                ListaPrin.lista1.add("Brocoli",.87f,  0f,  7.55f, 10f, 5.8f, 10.75f, 69.75f, 1.38f, 15.89f, 7.5f, 13.85f, 111.11f);
        }
        
        if (chkAguacate.isSelected()){
               añadirDesayunos("Aguacate");
                ListaPrin.lista1.add("Aguacate",.13f,  0f,  3.99f, 21.1f, 1.2f, 6.13f, 121.75f, .29f, 1.33f, 6.67f, 6.15f, 6.67f);
        }
        
        if (chkPapa.isSelected()){
               añadirDesayunos("Papa");
                ListaPrin.lista1.add("Papa",4.83f,  0f,  4.97f, 6.9f, .64f, 5.38f, 104.5f, .17f, 9.67f, 9.17f, 3.85f, 18.89f);
        }
        
        if (chkCalabaza.isSelected()){
               añadirDesayunos("Calabaza");
                ListaPrin.lista1.add("Calabaza",1.5f,  0f,  2.4f, 7.2f, 2.2f, 10f, 76f, .19f, 14.18f, 4.17f, 5.38f, 13.33f);
        }
        
        if (chkZanahoria.isSelected()){
               añadirDesayunos("Zanahoria");
               ListaPrin.lista1.add("Zanahoria",1.55f,  0f,  1.43f, 2.07f, 2.7f, 6.25f, 54.75f, 3.25f, 48.56f, 5f, 4.62f, 4.22f);
        }
        
        if (chkApio.isSelected()){
               añadirDesayunos("Apio");
               ListaPrin.lista1.add("Apio",.81f,  0f,  2.53f, 4.67f, 4.1f, 5f, 80f, 6.25f, .92f, 4.17f, 6.15f, 4.44f);
        }
        
        if (chkLechuga.isSelected()){
               añadirDesayunos("Lechuga");
                ListaPrin.lista1.add("Lechuga",.46f,  0f,  2.91f, 5f, 3.47f, 12.5f, 55f, .19f, 20.78f, 5f, 5.38f, 14.44f);
        }
        
        if (chkChampiñones.isSelected()){
               añadirDesayunos("Champiñones");
                ListaPrin.lista1.add("Champiñones",.18f,  0f,  9.02f, 7.2f, 1.08f, 12.5f, 97.5f, .49f, 0f, 8.33f, 23.85f, 4.44f);
        }
        
        //Carnes
        if (chkRes.isSelected()){
               añadirDesayunos("Res");
              ListaPrin.lista1.add("Res",0.0f, 2.6f, 19.0f, 0.0f, 0.0f,2.6f, 21.0f, 72.0f, 318.0f, 0.05f, 0.14f, 0.0f);
        }
        
        if (chkPescado.isSelected()){
               añadirDesayunos("Pescado");
               ListaPrin.lista1.add("Pescado",0.0f, 1.58f, 20.08f , 0.0f, 10.0f, 0.56f, 27.0f, 52.0f, 302.0f, 0.04f, 0.06f, 0.0f);
        }
        
        if (chkAtun.isSelected()){
               añadirDesayunos("Atun");
              ListaPrin.lista1.add("Atun",0f, 0f, 18.9f, 0f, 0.01f, 0.08f, 0.02f, 0.3f, 0.1f, 0f, 0f, 0f);
        }
        if (chkCerdo.isSelected()){
               añadirDesayunos("Cerdo");
               ListaPrin.lista1.add("Cerdo",0.0f, 2.1f, 36.64f, 0.0f, 0.0f, 0.9f, 13.0f, 515.0f, 470.0f, 0.79f, 0.2f, 0.0f);
        }
        
        if (chkPollo.isSelected()){
               añadirDesayunos("Pollo");
              ListaPrin.lista1.add("Pollo",0f, 12f, 32.7f, 0f, 0f, 0.7f, 0f, 396f, 254f, 13f , 24.6f, 0f);
        }
        
        if (chkMariscos.isSelected()){
               añadirDesayunos("Mariscos");
              ListaPrin.lista1.add("Mariscos",0.0f,4.10f,18.1f,0.0f,80.0f,1.6f,36.0f,192.0f,254.0f,0.09f,0.0f,0.0f);
        }
        
        //Cereales
        if (chkPasta.isSelected()){
               añadirDesayunos("Pasta");
                ListaPrin.lista1.add("Pasta",23.15f,  0f,  27.12f, 11.8f, 2.4f, 22.5f, 59f, .44f, 0f, 7.5f, 4.62f, 0f);
        }
        
        if (chkPan.isSelected()){
               añadirDesayunos("Pan");
                ListaPrin.lista1.add("Pan",52f, 0f, 7.5f, 3.5f, 0.2f, 0.03f, 0.02f, 0.5f, 0.03f, 0f, 0f, 0f);
        }
        
        if (chkQuinoa.isSelected()){
               añadirDesayunos("Quinoa");
               ListaPrin.lista1.add("Quinoa",68.9f, 0.0f, 27.8f, 23.33f, 127.0f, 12.0f, 697.0f, 11.5f, 697.0f, 0.3f, 0.3f, 0.0f);
        }
        
        if (chkArroz.isSelected()){
               añadirDesayunos("Arroz");
               ListaPrin.lista1.add("Arroz",26.64f,  0f,  14.15f, 5.45f, 1.4f, 10f, 27.25f, .24f, 0f, 4.17f, 3.08f, 0f);
        }
        
        if (chkTrigo.isSelected()){
               añadirDesayunos("Trigo");
                ListaPrin.lista1.add("Trigo",9.99f,  0f,  60.69f, 49.65f, 4.9f, 106.25f, 248.25f, .31f, 1.14f, 166.67f, 55.38f, 0f);
        }
        
        if (chkMaiz.isSelected()){
               añadirDesayunos("Maiz");
               ListaPrin.lista1.add("Maiz",5.94f,  0f,  7.04f, 10f, .3f, 7.5f, 50f, 19f, 2f, 3.33f, 6.15f, 1.11f);
        }
        
        //Leguminosas
        if (chkFrijoles.isSelected()){
               añadirDesayunos("Frijoles");
               ListaPrin.lista1.add("Frijoles",62.4f, 0.0f, 21.6f, 15.2f, 123.0f, 5.0f, 1483.0f, 5.0f, 1483.0f, 0.9f, 2.0f, 0.0f);
        }
        
        if (chkSoya.isSelected()){
               añadirDesayunos("Soya");
                ListaPrin.lista1.add("Soya",6.29f, 0.0f, 34.74f, 22.0f, 201.0f, 6.6f, 1799.0f, 4.7f, 1799.0f, 0.61f, 0.27f, 3.0f);
        }
        
        if (chkAlubias.isSelected()){
               añadirDesayunos("Alubias");
               ListaPrin.lista1.add("Alubias",54.8f, 0.0f, 21.4f, 21.3f, 0.0f,6.2f, 163.0f, 0.0f, 1160.0f , 0.5f, 2.4f, 0.0f);
        }
        
        if (chkLentejas.isSelected()){
               añadirDesayunos("Lentejas");
                ListaPrin.lista1.add("Lentejas",19.5f, 0f, 9f, 7.9f, 0.01f, 0.03f, 0.03f, 0.2f, 0.3f, 0f, 0f, 0f);
        }
        
        if (chkHabas.isSelected()){
               añadirDesayunos("Habas");
              ListaPrin.lista1.add("Habas",19.6f, 0f, 7.6f, 5.4f, 0f, 0f, 0f, 0.1f, 0.02f, 0f, 0f, 0f);
        }
        
        if (chkEjotes.isSelected()){
               añadirDesayunos("Ejotes");
                ListaPrin.lista1.add("Ejotes",25f, 0f, 8.6f, 8.8f, 0f, 0f, 0f, 0.4f, 0.4f, 0f, 0f, 0f);
        }
        
        if (chkGarbanzos.isSelected()){
               añadirDesayunos("Garbanzos");
               ListaPrin.lista1.add("Garbanzos",44.0f, 0.0f, 20.8f, 15.5f, 143.0f, 6.8f, 875.0f, 25.0f, 875.5f, 0.45f, 0.14f, 4.1f);
        }
        
        if (chkCacahuates.isSelected()){
               añadirDesayunos("Cacahuates");
               ListaPrin.lista1.add("Cacahuates",4.6f, 0f, 8.4f, 2.8f, 0.01f, 0f, 0.05f, 0.1f, 0.02f, 0f, 0f, 0f);
        }
        
        //Otros
        if (chkLeche.isSelected()){
               añadirDesayunos("Leche");
               ListaPrin.lista1.add("Leche",4.8f, 0f, 3.1f, 0f, 0.1f, 0f, 0.01f, 0.1f, 0.1f, 0f, 0f, 0f);
        }
        
        if (chkHuevo.isSelected()){
               añadirDesayunos("Huevo");
              ListaPrin.lista1.add("Huevo",1.1f, 0f, 12.6f, 0f, 0.05f, 0f, 0f, 0.1f, 0.01f, 0f, 0f, 0f);
        }
        
        if (chkMiel.isSelected()){
               añadirDesayunos("Miel");
              ListaPrin.lista1.add("Miel",82.4f, 0f, 0.3f, 0.2f, 0f, 0f, 0f, 0.1f, 0.05f, 0f, 0f, 0f);
        }
        
        if (chkQueso.isSelected()){
               añadirDesayunos("Queso");
               ListaPrin.lista1.add("Queso",5.6f, 0f, 21.6f, 0f, 0.6f, 0f, 0.02f, 0.6f, 0.05f, 0f, 0f, 0f);
        }
        
        if (chkYogurt.isSelected()){
               añadirDesayunos("Yogurt");
              ListaPrin.lista1.add("Yogurt",11.4f, 0f, 8.5f, 0f, 0.02f, 0f, 0f, 0.1f, 0.03f, 0f, 0f, 0f);
        }
        
        //Snacks
        if (chkPalomitas.isSelected()){
               añadirDesayunos("Palomitas");
               ListaPrin.lista1.add("Palomitas",77.9f, 0f, 12.9f, 14.5f, 0f, 0.01f, 0.1f, 0.03f, 0f, 0f, 0f, 0f);
        }
        
        if (chkChocolate.isSelected()){
               añadirDesayunos("Chocolate");
               ListaPrin.lista1.add("Chocolate",76.4f, 0f, 2.4f, 1.7f, 0.04f, 0f, 0.03f, 0.1f, 0.01f, 0f, 0f, 0f);
        }
        
        if (chkGalletas.isSelected()){
               añadirDesayunos("Galletas");
              ListaPrin.lista1.add("Galletas",63.9f, 0f, 5.1f, 2.4f, 0.02f, 0f, 0f, 0.3f, 0.01f, 0f, 0f, 0f);
        }
    }//GEN-LAST:event_btnAnadirDes2ActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        chkFresas.setSelected(false);
        chkNaranja.setSelected(false);
        chkPlatano.setSelected(false);
        chkMelon.setSelected(false);
        chkManzana.setSelected(false);
        chkPapaya.setSelected(false);
        chkPera.setSelected(false);
        chkPiña.setSelected(false);
        chkGuayaba.setSelected(false);
        chkMoras.setSelected(false);
        chkDurazno.setSelected(false);
        Mango.setSelected(false);
        chkElote.setSelected(false);
        chkChile.setSelected(false);
        chkTomate.setSelected(false);
        chkCebolla.setSelected(false);
        chkBrocoli.setSelected(false);
        chkAguacate.setSelected(false);
        chkPapa.setSelected(false);
        chkCalabaza.setSelected(false);
        chkZanahoria.setSelected(false);
        chkApio.setSelected(false);
        chkLechuga.setSelected(false);
        chkChampiñones.setSelected(false);
        chkRes.setSelected(false);
        chkPescado.setSelected(false);
        chkAtun.setSelected(false);
        chkCerdo.setSelected(false);
        chkPollo.setSelected(false);
        chkMariscos.setSelected(false);
        chkPasta.setSelected(false);
        chkPan.setSelected(false);
        chkQuinoa.setSelected(false);
        chkArroz.setSelected(false);
        chkTrigo.setSelected(false);
        chkMaiz.setSelected(false);
        chkFrijoles.setSelected(false);
        chkSoya.setSelected(false);
        chkAlubias.setSelected(false);
        chkLentejas.setSelected(false);
        chkHabas.setSelected(false);
        chkEjotes.setSelected(false);
        chkGarbanzos.setSelected(false);
        chkCacahuates.setSelected(false);
        chkLeche.setSelected(false);
        chkHuevo.setSelected(false);
        chkMiel.setSelected(false);
        chkQueso.setSelected(false);
        chkYogurt.setSelected(false);
        chkPalomitas.setSelected(false);
        chkChocolate.setSelected(false);
        chkGalletas.setSelected(false);
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        new OrdenarAlimentos().setVisible(true);
    }//GEN-LAST:event_btnOrdenarActionPerformed
/*private void añadirCena (String alimento1 ){
        Comidas1.txaCena.setText(Comidas1.txaCena.getText()+alimento1+"\n");
    }
    */
    
    private void calcularNutriFresas (float carbohidratos,float vb12,float proteina,float fibra,float calcio,float hierro,float magnesio,float sodio,float potasio,float vb1,float vb2,float vbc){
    if (chkFresas.isSelected()){
       // obj_nutrientes.carbohidratos+=(txtCalcularGramos*1.71)/(100);
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JCheckBox Mango;
    public static javax.swing.JLabel Snacks;
    public static javax.swing.JButton btnAnadirComida;
    public static javax.swing.JButton btnAnadirDes2;
    public static javax.swing.JButton btnAnadirSnack;
    public static javax.swing.JButton btnAnadircena;
    public static javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnOrdenar;
    public static javax.swing.JButton btnVolver;
    public static javax.swing.JCheckBox chkAguacate;
    public static javax.swing.JCheckBox chkAlubias;
    public static javax.swing.JCheckBox chkApio;
    public static javax.swing.JCheckBox chkArroz;
    public static javax.swing.JCheckBox chkAtun;
    public static javax.swing.JCheckBox chkBrocoli;
    public static javax.swing.JCheckBox chkCacahuates;
    public static javax.swing.JCheckBox chkCalabaza;
    public static javax.swing.JCheckBox chkCebolla;
    public static javax.swing.JCheckBox chkCerdo;
    public static javax.swing.JCheckBox chkChampiñones;
    public static javax.swing.JCheckBox chkChile;
    public static javax.swing.JCheckBox chkChocolate;
    public static javax.swing.JCheckBox chkDurazno;
    public static javax.swing.JCheckBox chkEjotes;
    public static javax.swing.JCheckBox chkElote;
    public static javax.swing.JCheckBox chkFresas;
    public static javax.swing.JCheckBox chkFrijoles;
    public static javax.swing.JCheckBox chkGalletas;
    public static javax.swing.JCheckBox chkGarbanzos;
    public static javax.swing.JCheckBox chkGuayaba;
    public static javax.swing.JCheckBox chkHabas;
    public static javax.swing.JCheckBox chkHuevo;
    public static javax.swing.JCheckBox chkLeche;
    public static javax.swing.JCheckBox chkLechuga;
    public static javax.swing.JCheckBox chkLentejas;
    public static javax.swing.JCheckBox chkMaiz;
    public static javax.swing.JCheckBox chkManzana;
    public static javax.swing.JCheckBox chkMariscos;
    public static javax.swing.JCheckBox chkMelon;
    public static javax.swing.JCheckBox chkMiel;
    public static javax.swing.JCheckBox chkMoras;
    public static javax.swing.JCheckBox chkNaranja;
    public static javax.swing.JCheckBox chkPalomitas;
    public static javax.swing.JCheckBox chkPan;
    public static javax.swing.JCheckBox chkPapa;
    public static javax.swing.JCheckBox chkPapaya;
    public static javax.swing.JCheckBox chkPasta;
    public static javax.swing.JCheckBox chkPera;
    public static javax.swing.JCheckBox chkPescado;
    public static javax.swing.JCheckBox chkPiña;
    public static javax.swing.JCheckBox chkPlatano;
    public static javax.swing.JCheckBox chkPollo;
    public static javax.swing.JCheckBox chkQueso;
    public static javax.swing.JCheckBox chkQuinoa;
    public static javax.swing.JCheckBox chkRes;
    public static javax.swing.JCheckBox chkSoya;
    public static javax.swing.JCheckBox chkTomate;
    public static javax.swing.JCheckBox chkTrigo;
    public static javax.swing.JCheckBox chkYogurt;
    public static javax.swing.JCheckBox chkZanahoria;
    public static javax.swing.JLabel imagfruta;
    public static javax.swing.JLabel imagfruta1;
    public static javax.swing.JLabel imagfruta2;
    public static javax.swing.JLabel imagfruta3;
    public static javax.swing.JLabel imagfruta4;
    public static javax.swing.JLabel imagfruta5;
    public static javax.swing.JLabel imagfruta6;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables
}
