package Formularios;

import BD.Conexion;
import BD.CargarComboBox;
import Empleado.EmpleadoBean;
import Empleado.EmpleadoDTO;
import Empleado.EmpleadoDao;
//import static Formularios.CapturaDatos.TEMPLATE_PROPERTY;
import api.Api;
import com.digitalpersona.onetouch.DPFPDataPurpose;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPSample;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.capture.event.DPFPDataAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPDataEvent;
import com.digitalpersona.onetouch.capture.event.DPFPErrorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPErrorEvent;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent;
import com.digitalpersona.onetouch.capture.event.DPFPSensorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPSensorEvent;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.processing.DPFPFeatureExtraction;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import static com.digitalpersona.onetouch.processing.DPFPTemplateStatus.TEMPLATE_STATUS_FAILED;
import static com.digitalpersona.onetouch.processing.DPFPTemplateStatus.TEMPLATE_STATUS_READY;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import com.digitalpersona.onetouch.verification.DPFPVerificationResult;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.xml.sax.Attributes;



public class AltaDeEmpleado extends javax.swing.JInternalFrame {
    File file, copia;
    public AltaDeEmpleado() {
        initComponents();
        //this.setLocationRelativeTo(null);
        
//        addWindowListener(new java.awt.event.WindowAdapter() {
//            public void windowClosing(java.awt.event.WindowEvent evt) {
//                formWindowClosing(evt);
//            }
//            public void windowOpened(java.awt.event.WindowEvent evt) {
//                formWindowOpened(evt);
//            }
//        });
        // cargar datso en comboBox puesto
        lblImagenHuella.setIcon(null);
        jLabel3.setIcon(null);
        CargarComboBox metodos_cargarcombobox = new CargarComboBox();
        metodos_cargarcombobox.consultar_puestos(cboxPuesto); //.consultar_paises(cbox_Paises);
        
        // cargar datso en comboBox grupo
        metodos_cargarcombobox.consultar_grupos(cboxGrupo); //.consultar_paises(cbox_Paises);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblImagenHuella = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        cboxPuesto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cboxGrupo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        btnExaminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoraEntrada = new javax.swing.JFormattedTextField();
        txtHoraSalida = new javax.swing.JFormattedTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(0, 0, 255));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(new java.awt.Color(0, 0, 255));
        setTitle("Alta de empleado");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL EMPLEADO"));
        jPanel2.setAutoscrolls(true);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Nombre(s):");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 570, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 570, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 560, 40));

        jLabel17.setText("Apellidos:");
        jLabel17.setAlignmentY(1.0F);
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagenHuella.setBackground(new java.awt.Color(255, 51, 51));
        lblImagenHuella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hueya.png"))); // NOI18N
        jPanel3.add(lblImagenHuella, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 170));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 190, 190));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 570, 100));

        jLabel1.setText("Puesto:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        cboxPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPuestoActionPerformed(evt);
            }
        });
        jPanel2.add(cboxPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 370, -1));

        jLabel2.setText("Grupo al que pertenece");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jPanel2.add(cboxGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 370, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hueya.png"))); // NOI18N
        jScrollPane2.setViewportView(jLabel3);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 400, 340));

        btnExaminar.setText("Examinar");
        btnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnExaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 400, -1));

        jLabel4.setText("Hora de entrada:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel5.setText("Hora de salida:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        try {
            txtHoraEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtHoraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, -1));

        try {
            txtHoraSalida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtHoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 120, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1040, 510));
        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Formularios.FuncionesComunes comun = new FuncionesComunes();
        if(   comun.validarHora(txtHoraEntrada.getText()) && comun.validarHora(txtHoraSalida.getText())   )
        {
            guardarHuella();
            Reclutador.clear();
            lblImagenHuella.setIcon(null);
            start();
        }
        else{
            JOptionPane.showMessageDialog(AltaDeEmpleado.this, "Error al validar los campos de horas, intentelo nuevamente", "Validación fallida", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cboxPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxPuestoActionPerformed

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed

        Api x= new Api();
        javax.swing.filechooser.FileFilter filtro = new FileNameExtensionFilter("Archivo JPG(.jpg)", "jpg");
        JFileChooser selector=new JFileChooser();
        selector.setFileFilter(filtro);
        selector.setDialogTitle("Abrir archivo...");
        File ruta = new File("tarea4");
        selector.setCurrentDirectory(ruta);
        int resultado=selector.showOpenDialog(null);
        if(resultado==JFileChooser.APPROVE_OPTION){
            file=selector.getSelectedFile();
            copia=new File(file.getAbsolutePath());

            try {
                x.obtenerImagen(copia);
                this.jLabel3.setIcon(new ImageIcon(x.imagen));

                //m.leerMatriz(copia);
            } catch (IOException ex) {

            }
        }
    }//GEN-LAST:event_btnExaminarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        stop();
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Iniciar();
        start();
        //EstadoHuellas();
        //btnGuardar.setEnabled(true);
        //btnIdentificar.setEnabled(true);
        //btnSalir.grabFocus();
    }//GEN-LAST:event_formInternalFrameOpened

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
            java.util.logging.Logger.getLogger(AltaDeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaDeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaDeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaDeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaDeEmpleado().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cboxGrupo;
    private javax.swing.JComboBox<String> cboxPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImagenHuella;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JFormattedTextField txtHoraEntrada;
    private javax.swing.JFormattedTextField txtHoraSalida;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        stop();
    } 

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        Iniciar();
        start();
        //EstadoHuellas();
        //btnGuardar.setEnabled(true);
        //btnIdentificar.setEnabled(true);
        //btnSalir.grabFocus();
    }
    public  void EstadoHuellas(){
        EnviarTexto("Muestra de Huellas Necesarias para Guardar Template "+ Reclutador.getFeaturesNeeded());
    }    

    //Varible que permite iniciar el dispositivo de lector de huella conectado
    // con sus distintos metodos.
    private DPFPCapture Lector = DPFPGlobal.getCaptureFactory().createCapture();

    //Varible que permite establecer las capturas de la huellas, para determina sus caracteristicas
    // y poder estimar la creacion de un template de la huella para luego poder guardarla
    private DPFPEnrollment Reclutador = DPFPGlobal.getEnrollmentFactory().createEnrollment();

    //Esta variable tambien captura una huella del lector y crea sus caracteristcas para auntetificarla
    // o verificarla con alguna guardada en la BD
    private DPFPVerification Verificador = DPFPGlobal.getVerificationFactory().createVerification();

    //Variable que para crear el template de la huella luego de que se hallan creado las caracteriticas
    // necesarias de la huella si no ha ocurrido ningun problema
    private DPFPTemplate template;
    public static String TEMPLATE_PROPERTY = "template";    
    
    public void EnviarTexto(String string) {
        txtArea.append(string + "\n");
    } 
    
    protected void Iniciar(){
        Lector.addDataListener(new DPFPDataAdapter() {
            @Override public void dataAcquired(final DPFPDataEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        EnviarTexto("La Huella Digital ha sido Capturada");
                        ProcesarCaptura(e.getSample());
                    }
                });
            }
        });

        Lector.addReaderStatusListener(new DPFPReaderStatusAdapter() {
            @Override public void readerConnected(final DPFPReaderStatusEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                    EnviarTexto("El Sensor de Huella Digital esta Activado o Conectado");
                    }
                });
            }

            @Override public void readerDisconnected(final DPFPReaderStatusEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        EnviarTexto("El Sensor de Huella Digital esta Desactivado o no Conectado");
                    }
                });
            }
        });

        Lector.addSensorListener(new DPFPSensorAdapter() {
            @Override public void fingerTouched(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        EnviarTexto("El dedo ha sido colocado sobre el Lector de Huella");
                    }
                });
            }

            @Override public void fingerGone(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        EnviarTexto("El dedo ha sido quitado del Lector de Huella");
                    }
                });
            }
        });

        Lector.addErrorListener(new DPFPErrorAdapter(){
            public void errorReader(final DPFPErrorEvent e){
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        EnviarTexto("Error: "+e.getError());
                    }
                });
            }
        });
    } 
    
    public DPFPFeatureSet featuresinscripcion;
    public DPFPFeatureSet featuresverificacion;

    public DPFPFeatureSet extraerCaracteristicas(DPFPSample sample, DPFPDataPurpose purpose){
        DPFPFeatureExtraction extractor = DPFPGlobal.getFeatureExtractionFactory().createFeatureExtraction();
        try {
            return extractor.createFeatureSet(sample, purpose);
        }
        catch (DPFPImageQualityException e) {
            return null;
        }
    }


    public void ProcesarCaptura(DPFPSample sample){
        // Procesar la muestra de la huella y crear un conjunto de características con el propósito de inscripción.
        featuresinscripcion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_ENROLLMENT);

        // Procesar la muestra de la huella y crear un conjunto de características con el propósito de verificacion.
        featuresverificacion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);

        // Comprobar la calidad de la muestra de la huella y lo añade a su reclutador si es bueno
        if (featuresinscripcion != null){
            try{
                System.out.println("Las Caracteristicas de la Huella han sido creada");
                Reclutador.addFeatures(featuresinscripcion);// Agregar las caracteristicas de la huella a la plantilla a crear

                // Dibuja la huella dactilar capturada.
                Image image=CrearImagenHuella(sample);
                DibujarHuella(image);

                //btnIdentificar.setEnabled(true);
            }
            catch (DPFPImageQualityException ex) {
                System.err.println("Error: "+ex.getMessage());
            }

            finally {
                //EstadoHuellas();

                // Comprueba si la plantilla se ha creado.
                switch(Reclutador.getTemplateStatus()){
                    case TEMPLATE_STATUS_READY: // informe de éxito y detiene  la captura de huellas
                        //EnviarTexto("La Plantilla de la Huella ha Sido Creada, ya puede Verificarla");    
                        stop();
                        setTemplate(Reclutador.getTemplate());
                        EnviarTexto("**************************************************************");
                        EnviarTexto("La plantilla de la huella ha sido creada, ya puede guardarla");
                        //btnIdentificar.setEnabled(true);
                        //btnGuardar.setEnabled(true);
                        //btnGuardar.grabFocus();
                    break;

                    case TEMPLATE_STATUS_FAILED: // informe de fallas y reiniciar la captura de huellas
                        Reclutador.clear();
                        stop();
                        //EstadoHuellas();
                        setTemplate(null);
                        JOptionPane.showMessageDialog(AltaDeEmpleado.this, "La Plantilla de la Huella no pudo ser creada, Repita el Proceso", "Inscripcion de Huellas Dactilares", JOptionPane.ERROR_MESSAGE);
                        start();
                    break;
                }
            }
        }
    }

    public void DibujarHuella(Image image) {
        lblImagenHuella.setIcon(new ImageIcon(
            image.getScaledInstance(lblImagenHuella.getWidth(), lblImagenHuella.getHeight(), Image.SCALE_DEFAULT)));
        repaint();
    }

    public void start(){
        Lector.startCapture();
        EnviarTexto("Utilizando el Lector de Huella Dactilar ");
    }

    public void setTemplate(DPFPTemplate template) {
        DPFPTemplate old = this.template;
        this.template = template;
        firePropertyChange(TEMPLATE_PROPERTY, old, template);
    }

    public Image CrearImagenHuella(DPFPSample sample) {
        return DPFPGlobal.getSampleConversionFactory().createImage(sample);
    }

    public void stop(){
        Lector.stopCapture();
        EnviarTexto("No se está usando el Lector de Huella Dactilar ");
    }

    public DPFPTemplate getTemplate() {
        return template;
    }

    private void guardarHuella() {    
        int resultado;
        DPFPEnrollment enrollment = DPFPGlobal.getEnrollmentFactory().createEnrollment();
        if(template== null){
            template = enrollment.getTemplate();
        }
        ByteArrayInputStream datosHuella = null;
        try{
            datosHuella = new ByteArrayInputStream(template.serialize());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Debe volver a escaner la huella, hasta que la plantilla sea creada");
        }
        Integer tamañoHuella=template.serialize().length;
        Connection con= null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        EmpleadoBean empleado= null;
        try{
            con= Conexion.getConexion();
            //stmt= con.prepareStatement("select clave, hueya, hueya1 from empleado where clave= ?");
            //stmt.setInt(1, Integer.parseInt(txtClave.getText()));
            //rs = stmt.executeQuery();
        //        if(rs.next()){
        //           //Lee la plantilla de la base de datos
        //            byte templateBuffer[] = rs.getBytes(2);
        //            //Crea una nueva plantilla a partir de la guardada en la base de datos
        //            DPFPTemplate referenceTemplate = DPFPGlobal.getTemplateFactory().createTemplate(templateBuffer);
        //            //Envia la plantilla creada al objeto contendor de Template del componente de huella digital
        //            setTemplate(referenceTemplate);
        //              //Compara las caracteriticas de la huella recientemente capturda con la
        //            // plantilla guardada al usuario especifico en la base de datos
        //            DPFPVerificationResult result = Verificador.verify(featuresverificacion, getTemplate());
        //
        //            //compara las plantilas (actual vs bd)
        //if (result.isVerified()){
        //JOptionPane.showMessageDialog(null, "La huella ya existe, coloque un dedo diferente");
        //}
        //else{
        //PreparedStatement guardarStmt2 = con.prepareStatement("update empleado set hueya1=? where (clave=?)");
        //guardarStmt2.setBinaryStream(1, datosHuella,tamañoHuella);
        //guardarStmt2.setInt(2,Integer.parseInt(txtClave.getText()));
        //
        ////Ejecuta la sentencia
        //guardarStmt2.execute();
        //guardarStmt2.close();
        //JOptionPane.showMessageDialog(null,"Huella Guardada Correctament");
        //}
        //}
    //    else if(!rs.next()){
        //String nombre = JOptionPane.showInputDialog("Nombre y Apellidos:");
        try{   
            PreparedStatement guardarStmt = con.prepareStatement("INSERT INTO tb_empleados (nombres, apellidos, idPuesto,idGrupo, huella,foto,horaEntrada,horaSalida) "
            + "values(?,?,(select id from tb_puestos where puesto = ?),(select id from tb_grupos where grupo = ?),?,?,?,?)");
            guardarStmt.setString(  1,txtNombre.getText());
            guardarStmt.setString(  2,txtApellidos.getText());
            guardarStmt.setString(     3,cboxPuesto.getSelectedItem().toString());
            guardarStmt.setString(     4,cboxGrupo.getSelectedItem().toString());
            guardarStmt.setBinaryStream(5, datosHuella,tamañoHuella);
            FileInputStream fis = new FileInputStream(file);
            guardarStmt.setBinaryStream(6, fis,(int)file.length());
            guardarStmt.setString(7,txtHoraEntrada.getText());
            guardarStmt.setString(8,txtHoraSalida.getText());
            //Ejecuta la sentencia
            guardarStmt.executeUpdate();
            guardarStmt.close();
            JOptionPane.showMessageDialog(null,"Datos guardados correctamente");

            //Lector.stopCapture();
            //stop();
            txtArea.setText(null);
            this.jLabel3.setIcon(null);
            txtNombre.setText(null);
            txtApellidos.setText(null);
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(null,ex.getMessage());   
            JOptionPane.showMessageDialog(null,"Debe completar todos los campos");
        }

        }catch(Exception ex){
            ex.printStackTrace();
        }

    } // Fin guardarHuella()


    
}
