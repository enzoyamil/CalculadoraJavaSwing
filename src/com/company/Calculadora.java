package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;
public class Calculadora extends JFrame{
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9;
    private JButton botonSuma;
    private JButton botonResta;
    private JButton botonMultiplicar;
    private JButton botonDividir;
    private JButton botonIgual;
    private JButton botonPunto;
    private JButton boton0;
    private JPanel panelSuperior;
    private JPanel panelInferior;
    private JTextField display;
    double op1,op2;
    String operacion="";
    Boolean nueva=true;
    public Calculadora(){
        super("Calculadora Trucha");
        setSize(700,700);
        display=new JTextField(10);
        add(display);
        panelSuperior=new JPanel(new FlowLayout());
        panelSuperior.add(display);
        panelInferior=new JPanel(new GridLayout(4,4,10,10));
        boton0=new JButton("0");
        boton1=new JButton("1");
        boton2=new JButton("2");
        boton3=new JButton("3");
        boton4=new JButton("4");
        boton5=new JButton("5");
        boton6=new JButton("6");
        boton7=new JButton("7");
        boton8=new JButton("8");
        boton9=new JButton("9");
        botonSuma=new JButton("+");
        botonResta=new JButton("-");
        botonMultiplicar=new JButton("*");
        botonDividir=new JButton("/");
        botonIgual=new JButton("=");
        botonPunto=new JButton(".");
        panelInferior.add(boton0);
        panelInferior.add(boton1);
        panelInferior.add(boton2);
        panelInferior.add(boton3);
        panelInferior.add(boton4);
        panelInferior.add(boton5);
        panelInferior.add(boton6);
        panelInferior.add(boton7);
        panelInferior.add(boton8);
        panelInferior.add(boton9);
        panelInferior.add(botonSuma);
        panelInferior.add(botonResta);
        panelInferior.add(botonMultiplicar);
        panelInferior.add(botonDividir);
        panelInferior.add(botonIgual);
        panelInferior.add(botonPunto);
        setLayout(new BorderLayout());
        add(panelSuperior,BorderLayout.NORTH);
        add(panelInferior,BorderLayout.SOUTH);
        //EVENTO DE LOS BOTONES;//
        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if(nueva){display.setText("");nueva=false;}
            display.setText(display.getText()+"0");
            }
        });
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"1");
            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"2");
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nueva) {
                    display.setText("");
                    nueva = false;
                }
                display.setText(display.getText() + "3");
            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nueva){
                    display.setText("");
                    nueva=false;
                }
                display.setText(display.getText()+"4");
            }
        });
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nueva){
                    display.setText("");
                    nueva=false;
                }
                display.setText(display.getText()+"5");
            }
        });
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nueva){
                    display.setText("");
                    nueva=false;
                }
                display.setText(display.getText()+"6");
            }
        });
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nueva){
                    display.setText("");
                    nueva=false;
                }
                display.setText(display.getText()+"7");
            }
        });
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nueva){
                    display.setText("");
                    nueva=false;
                }
                display.setText(display.getText()+"8");
            }
        });
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nueva){
                    display.setText("");
                    nueva=false;
                }
                display.setText(display.getText()+"9");
            }
        });
        botonPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nueva){
                    display.setText("");
                    nueva=false;
                }
                display.setText(display.getText()+".");
            }
        });

        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(op1!=0)
                        op1=op1+Double.parseDouble(display.getText());

                    else
                        op1=Double.parseDouble(display.getText());
                    operacion="suma";
                    display.setText("");
                }catch (Exception err){}

            }
        });
        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(op1!=0)
                        op1=op1-Double.parseDouble(display.getText());

                    else
                        op1=Double.parseDouble(display.getText());
                    operacion="resta";
                    display.setText("");
                }catch (Exception err){}

            }
        });
        botonMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(op1!=0)
                        op1=op1*Double.parseDouble(display.getText());

                    else
                        op1=Double.parseDouble(display.getText());
                    operacion="Multiplicar";
                    display.setText("");
                }catch (Exception err){}

            }
        });
        botonDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(op1!=0)
                        op1=op1/Double.parseDouble(display.getText());

                    else
                        op1=Double.parseDouble(display.getText());
                    operacion="dividir";
                    display.setText("");
                }catch (Exception err){}

            }
        });
       //Igual
        botonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    op2 = Double.parseDouble(display.getText());
                } catch (Exception err) {}
                if (operacion.equals("suma")) {
                    double res = op1 + op2;
                    display.setText(String.valueOf(res));
                    op1 = op2 = 0;
                    operacion = "";
                } else if (operacion.equals("resta")){
                    double res = op1 - op2;
                    display.setText(String.valueOf(res));
                    op1 = op2 = 0;
                    operacion = "";
                } else if(operacion.equals("Multiplicar")){
                    double res = op1 * op2;
                    display.setText(String.valueOf(res));
                    op1 = op2 = 0;
                    operacion = "";
                }else if(operacion.equals("Dividir")){
                    double res = op1 * op2;
                    display.setText((String.valueOf(res)));
                    op1 = op2 = 0;
                    operacion = "";
                }
                nueva = true;
            }
        });
    }

    }


