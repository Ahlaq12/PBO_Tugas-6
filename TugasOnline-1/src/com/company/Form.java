package com.company;

import java.awt.event.ActionEvent;

public class Form {import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

    /**
     *
     * @author WINDOWS
     */
    public class Form extends JFrame{

        JLabel Hobi, Nama, Jenis_kelamin, Alamat,Perempuan,Laki;
        JTextField textHobi, textNama;
        JTextArea textAlamat;

        public void tampilanForm(){
            setTitle("BIODATA");
            JButton btncetak = new JButton("Cetak");
            Nama = new JLabel ("Nama");
            Hobi = new JLabel ("HOBI");
            Jenis_kelamin = new JLabel ("Gender");
            Alamat = new JLabel("Alamat");
            textNama= new JTextField();
            textHobi =new JTextField();
            textAlamat = new JTextArea();
            JRadioButton l = new JRadioButton(" Laki-Laki ");
            JRadioButton p = new JRadioButton("perempuan ");
            perempuan = new JLabel("perempuan");
            laki = new JLabel("Laki");


            ButtonGroup group = new ButtonGroup();
            group.add(p);
            group.add(l);


            setLayout(null);
            add(btncetak);
            add(Nama);
            add(Hobi);
            add(Jenis_kelamin);
            add(Alamat);
            add(textHobi);
            add(textNama);
            add(textAlamat);
            add(p);
            add(l);
            add(Perempuan);
            add(Laki);

            Nama.setBounds(10,20,100,20);
            Hobi.setBounds(10,50,100,20);
            textNama.setBounds(120,20,120,20);
            textHobi.setBounds(120,50,120,20);
            Jenis_kelamin.setBounds(10,80,100,20);
            Alamat.setBounds(10,110,100,20);
            textAlamat.setBounds(120,110,120,50);
            p.setBounds (120,80, 20,20);
            Perempuan.setBounds(150,80,100,20);
            l.setBounds(260,80,20,20);
            Laki.setBounds(290,80,100,20);
            btncetak.setBounds(120,170,100,20);


            setSize(400, 400);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);


            btncetak.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String Jenskel="";
                    if (l.isSelected()){
                        Jenskel = l.getText();
                    }else{
                        Jenskel = p.getText();
                    }
                    String Nama = textNama.getText();
                    String NIM = textHobi.getText();
                    String Alamat = textAlamat.getText();


                    System.out.println("NIM = "+ NIM);
                    System.out.println("NAMA = "+ Nama);
                    System.out.println("GENDER = "+ Jenskel);
                    System.out.println("ALAMAT  = "+ Alamat);

                }
            });

        }
    }
}
