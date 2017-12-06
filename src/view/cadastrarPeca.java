/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.PartController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mystogan
 */
public class cadastrarPeca extends javax.swing.JFrame {

    /**
     * Creates new form cadastrarPeca
     */
    public void setidioma(String idioma) {
        if ("Inglês".equals(idioma)) {
            String Code = "Code", Referency = "Referency ", Name = "Name", Description = "Description", Margin = "Margin", Count = "Count", CurrentAmount = "Current Amount", Unity = "Unity", AverageCost = "Average Cost", PurchasePrice = "Purchase Price", Purchaseshopping = "Shopping Price", Tributation = "Tributation", Group = "Group";
            this.label_code.setText(Code);
            this.label_averagecost.setText(AverageCost);
            this.label_count.setText(Count);
            this.label_currentamount.setText(CurrentAmount);
            this.label_description.setText(Description);
            this.label_group.setText(Group);
            this.label_margin.setText(Margin);
            this.label_name.setText(Name);
            this.label_sellprice.setText(PurchasePrice);
            this.label_referency.setText(Referency);
            this.label_shoppingprice.setText(Purchaseshopping);
            this.label_tributation.setText(Tributation);
            this.label_unity.setText(Unity);
        } else if ("Português Brasil".equals(idioma)) {
            String Code = "Código", Referency = "Referência", Name = "Nome", Description = "Descrição", Margin = "Margem", Count = "Contagem", CurrentAmount = "Quantidade Atual", Unity = "Unidade", AverageCost = "Preço Médio", PurchasePrice = "Preço Compra", Purchaseshopping = "Preço Venda", Tributation = "Tributação", Group = "Grupo";
            this.label_code.setText(Code);
            this.label_averagecost.setText(AverageCost);
            this.label_count.setText(Count);
            this.label_currentamount.setText(CurrentAmount);
            this.label_description.setText(Description);
            this.label_group.setText(Group);
            this.label_margin.setText(Margin);
            this.label_name.setText(Name);
            this.label_sellprice.setText(PurchasePrice);
            this.label_referency.setText(Referency);
            this.label_shoppingprice.setText(Purchaseshopping);
            this.label_tributation.setText(Tributation);
            this.label_unity.setText(Unity);
        }
    }

    public boolean verificaCampo() {
        String Code = "Código *", Referency = "Referência *", Name = "Nome *", Description = "Descrição *", Margin = "Margem *", Count = "Contagem *", CurrentAmount = "Quantidade Atual *", Unity = "Unidade *", AverageCost = "Preço Médio *", PurchasePrice = "Preço Compra *", Purchaseshopping = "Preço Venda *", Tributation = "Tributação *", Group = "Grupo *";
        if (campo_code.getText().isEmpty()) {
            this.label_code.setText(Code);
        }
        if (campo_averagecost.getText().isEmpty()) {
            this.label_averagecost.setText(AverageCost);
        }
        if (campo_count.getText().isEmpty()) {
            this.label_count.setText(Count);
        }
        if (campo_currentamount.getText().isEmpty()) {
            this.label_currentamount.setText(CurrentAmount);
        }
        if (campo_description.getText().isEmpty()) {
            this.label_description.setText(Description);
        }
        if (campo_group.getText().isEmpty()) {
            this.label_group.setText(Group);
        }
        if (campo_margin.getText().isEmpty()) {
            this.label_margin.setText(Margin);
        }
        if (campo_name.getText().isEmpty()) {
            this.label_name.setText(Name);
        }
        if (campo_purchaseprice.getText().isEmpty()) {
            this.label_sellprice.setText(Purchaseshopping);
        }
        if (campo_referency.getText().isEmpty()) {
            this.label_referency.setText(Referency);
        }
        if (campo_shoppingprice.getText().isEmpty()) {
            this.label_shoppingprice.setText(Purchaseshopping);
        }
        if (campo_tributation.getText().isEmpty()) {
            this.label_tributation.setText(Tributation);
        }
        if (campo_unity.getText().isEmpty()) {
            this.label_unity.setText(Unity);
        }
        if ((campo_code.getText().isEmpty()) || (campo_averagecost.getText().isEmpty()) || (campo_count.getText().isEmpty()) || (campo_currentamount.getText().isEmpty()) || (campo_description.getText().isEmpty()) || (campo_group.getText().isEmpty()) || (campo_margin.getText().isEmpty()) || (campo_name.getText().isEmpty()) || (campo_purchaseprice.getText().isEmpty()) || (campo_referency.getText().isEmpty()) || (campo_shoppingprice.getText().isEmpty()) || (campo_tributation.getText().isEmpty()) || (campo_unity.getText().isEmpty())) {
            return false;
        } else {
            return true;
        }
    }

    public cadastrarPeca() {
        initComponents();
    }

    public JTextField getCampo_Nome2() {
        return campo_Nome2;
    }

    public void setCampo_Nome2(JTextField campo_Nome2) {
        this.campo_Nome2 = campo_Nome2;
    }

    public JTextField getCampo_Nome3() {
        return campo_Nome3;
    }

    public void setCampo_Nome3(JTextField campo_Nome3) {
        this.campo_Nome3 = campo_Nome3;
    }

    public JTextField getCampo_averagecost() {
        return campo_averagecost;
    }

    public void setCampo_averagecost(JTextField campo_averagecost) {
        this.campo_averagecost = campo_averagecost;
    }

    public JTextField getCampo_code() {
        return campo_code;
    }

    public void setCampo_code(JTextField campo_code) {
        this.campo_code = campo_code;
    }

    public JTextField getCampo_count() {
        return campo_count;
    }

    public void setCampo_count(JTextField campo_count) {
        this.campo_count = campo_count;
    }

    public JTextField getCampo_currentamount() {
        return campo_currentamount;
    }

    public void setCampo_currentamount(JTextField campo_currentamount) {
        this.campo_currentamount = campo_currentamount;
    }

    public JTextField getCampo_description() {
        return campo_description;
    }

    public void setCampo_description(JTextField campo_description) {
        this.campo_description = campo_description;
    }

    public JTextField getCampo_group() {
        return campo_group;
    }

    public void setCampo_group(JTextField campo_group) {
        this.campo_group = campo_group;
    }

    public JTextField getCampo_margin() {
        return campo_margin;
    }

    public void setCampo_margin(JTextField campo_margin) {
        this.campo_margin = campo_margin;
    }

    public JTextField getCampo_name() {
        return campo_name;
    }

    public void setCampo_name(JTextField campo_name) {
        this.campo_name = campo_name;
    }

    public JTextField getCampo_purchaseprice() {
        return campo_purchaseprice;
    }

    public void setCampo_purchaseprice(JTextField campo_purchaseprice) {
        this.campo_purchaseprice = campo_purchaseprice;
    }

    public JTextField getCampo_referency() {
        return campo_referency;
    }

    public void setCampo_referency(JTextField campo_referency) {
        this.campo_referency = campo_referency;
    }

    public JTextField getCampo_shoppingprice() {
        return campo_shoppingprice;
    }

    public void setCampo_shoppingprice(JTextField campo_shoppingprice) {
        this.campo_shoppingprice = campo_shoppingprice;
    }

    public JTextField getCampo_tributation() {
        return campo_tributation;
    }

    public void setCampo_tributation(JTextField campo_tributation) {
        this.campo_tributation = campo_tributation;
    }

    public JTextField getCampo_unity() {
        return campo_unity;
    }

    public void setCampo_unity(JTextField campo_unity) {
        this.campo_unity = campo_unity;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getLabel_averagecost() {
        return label_averagecost;
    }

    public void setLabel_averagecost(JLabel label_averagecost) {
        this.label_averagecost = label_averagecost;
    }

    public JLabel getLabel_code() {
        return label_code;
    }

    public void setLabel_code(JLabel label_code) {
        this.label_code = label_code;
    }

    public JLabel getLabel_count() {
        return label_count;
    }

    public void setLabel_count(JLabel label_count) {
        this.label_count = label_count;
    }

    public JLabel getLabel_currentamount() {
        return label_currentamount;
    }

    public void setLabel_currentamount(JLabel label_currentamount) {
        this.label_currentamount = label_currentamount;
    }

    public JLabel getLabel_description() {
        return label_description;
    }

    public void setLabel_description(JLabel label_description) {
        this.label_description = label_description;
    }

    public JLabel getLabel_group() {
        return label_group;
    }

    public void setLabel_group(JLabel label_group) {
        this.label_group = label_group;
    }

    public JLabel getLabel_margin() {
        return label_margin;
    }

    public void setLabel_margin(JLabel label_margin) {
        this.label_margin = label_margin;
    }

    public JLabel getLabel_name() {
        return label_name;
    }

    public void setLabel_name(JLabel label_name) {
        this.label_name = label_name;
    }

    public JLabel getLabel_referency() {
        return label_referency;
    }

    public void setLabel_referency(JLabel label_referency) {
        this.label_referency = label_referency;
    }

    public JLabel getLabel_sellprice() {
        return label_sellprice;
    }

    public void setLabel_sellprice(JLabel label_sellprice) {
        this.label_sellprice = label_sellprice;
    }

    public JLabel getLabel_shoppingprice() {
        return label_shoppingprice;
    }

    public void setLabel_shoppingprice(JLabel label_shoppingprice) {
        this.label_shoppingprice = label_shoppingprice;
    }

    public JLabel getLabel_tributation() {
        return label_tributation;
    }

    public void setLabel_tributation(JLabel label_tributation) {
        this.label_tributation = label_tributation;
    }

    public JLabel getLabel_unity() {
        return label_unity;
    }

    public void setLabel_unity(JLabel label_unity) {
        this.label_unity = label_unity;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campo_code = new javax.swing.JTextField();
        campo_name = new javax.swing.JTextField();
        campo_Nome2 = new javax.swing.JTextField();
        campo_Nome3 = new javax.swing.JTextField();
        campo_description = new javax.swing.JTextField();
        campo_referency = new javax.swing.JTextField();
        campo_margin = new javax.swing.JTextField();
        campo_currentamount = new javax.swing.JTextField();
        campo_unity = new javax.swing.JTextField();
        campo_averagecost = new javax.swing.JTextField();
        campo_purchaseprice = new javax.swing.JTextField();
        campo_shoppingprice = new javax.swing.JTextField();
        campo_count = new javax.swing.JTextField();
        campo_group = new javax.swing.JTextField();
        campo_tributation = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label_referency = new javax.swing.JLabel();
        label_code = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        label_margin = new javax.swing.JLabel();
        label_description = new javax.swing.JLabel();
        label_count = new javax.swing.JLabel();
        label_unity = new javax.swing.JLabel();
        label_currentamount = new javax.swing.JLabel();
        label_averagecost = new javax.swing.JLabel();
        label_shoppingprice = new javax.swing.JLabel();
        label_tributation = new javax.swing.JLabel();
        label_sellprice = new javax.swing.JLabel();
        label_group = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(847, 847));
        setMinimumSize(new java.awt.Dimension(847, 847));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/fotos logo nova/gearlogo iniciof.png"))); // NOI18N
        jLabel1.setText("            Cadastrar Peça");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label_referency.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label_referency.setText("Referência");

        label_code.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label_code.setText("Código");

        label_name.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label_name.setText("Nome");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("Código");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setText("Código");

        label_margin.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label_margin.setText("Margem");

        label_description.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label_description.setText("Descrição");

        label_count.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label_count.setText("Contagem");

        label_unity.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label_unity.setText("Unidade");

        label_currentamount.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label_currentamount.setText("QTD Atual");

        label_averagecost.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label_averagecost.setText("Custo Médio");

        label_shoppingprice.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label_shoppingprice.setText("Preço Compra");

        label_tributation.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label_tributation.setText("Tributação");

        label_sellprice.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label_sellprice.setText("Preço Venda");

        label_group.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label_group.setText("Grupo");

        jLabel17.setText("* Campo Obrigatorio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17)
                    .addComponent(label_description)
                    .addComponent(label_group)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_margin, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_averagecost, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_purchaseprice, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_count, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_count)
                                    .addComponent(label_shoppingprice)))
                            .addComponent(label_margin)
                            .addComponent(label_averagecost))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_currentamount, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_currentamount))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_unity)
                                    .addComponent(campo_unity, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_shoppingprice, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_sellprice))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_tributation)
                                    .addComponent(campo_tributation, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_code, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_code))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_referency, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_referency))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_name)
                            .addComponent(campo_name, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_Nome2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(campo_Nome3)))
                    .addComponent(campo_description)
                    .addComponent(campo_group))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(589, 589, 589)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_referency)
                            .addComponent(label_name)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label_code)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_code, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_referency, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_Nome2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_Nome3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(label_description)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_description, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_margin)
                    .addComponent(label_count)
                    .addComponent(label_unity)
                    .addComponent(label_currentamount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_margin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_currentamount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_unity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_count, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_averagecost)
                    .addComponent(label_shoppingprice)
                    .addComponent(label_tributation)
                    .addComponent(label_sellprice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_averagecost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_purchaseprice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_shoppingprice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_tributation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(label_group)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_group, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PartController part = new PartController(this);
        if (verificaCampo()) {
           
            part.cadastrarPeca();
            JOptionPane.showMessageDialog(null, "nhaa");
        } else {
            JOptionPane.showMessageDialog(null, "nhaaaaaa");
            part.cadastrarPeca();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(cadastrarPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrarPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrarPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrarPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastrarPeca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo_Nome2;
    private javax.swing.JTextField campo_Nome3;
    private javax.swing.JTextField campo_averagecost;
    private javax.swing.JTextField campo_code;
    private javax.swing.JTextField campo_count;
    private javax.swing.JTextField campo_currentamount;
    private javax.swing.JTextField campo_description;
    private javax.swing.JTextField campo_group;
    private javax.swing.JTextField campo_margin;
    private javax.swing.JTextField campo_name;
    private javax.swing.JTextField campo_purchaseprice;
    private javax.swing.JTextField campo_referency;
    private javax.swing.JTextField campo_shoppingprice;
    private javax.swing.JTextField campo_tributation;
    private javax.swing.JTextField campo_unity;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel label_averagecost;
    private javax.swing.JLabel label_code;
    private javax.swing.JLabel label_count;
    private javax.swing.JLabel label_currentamount;
    private javax.swing.JLabel label_description;
    private javax.swing.JLabel label_group;
    private javax.swing.JLabel label_margin;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_referency;
    private javax.swing.JLabel label_sellprice;
    private javax.swing.JLabel label_shoppingprice;
    private javax.swing.JLabel label_tributation;
    private javax.swing.JLabel label_unity;
    // End of variables declaration//GEN-END:variables
}
