package randoop;

import junit.framework.*;

public class RandoopTest9 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test1");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setTipo("");
    int var16 = var5.getAvaliacaoPositiva();
    var5.setTipo("");
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test2");


    model.Avaliacao var3 = new model.Avaliacao("hi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", false);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test3");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNome();
    java.lang.String var13 = var5.getTipo();
    java.lang.String var14 = var5.getEspecialidade();
    int var15 = var5.getAvaliacaoNegativa();
    var5.setTipo("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test4");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!");
    java.lang.String var8 = var5.getTipo();
    boolean var13 = var5.verificaParametros(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var14 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var8.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var14.equals("hi!, hi!\n\nhi!, "));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test5");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var16 = var5.getAvaliacaoPositiva();
    java.lang.String var17 = var5.getNumeroRegistro();
    var5.setConvenio("hi!, hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test6");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    var19.setSala("hi!");
    boolean var27 = var5.equals((java.lang.Object)"hi!");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var34 = var5.verificaParametros("", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!");
    var5.setConvenio("hi!");
    model.ProfissionalSaude var42 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var43 = var42.getNome();
    java.lang.String var44 = var42.getNumeroRegistro();
    int var45 = var42.getAvaliacaoPositiva();
    var42.setTipo("hi!, hi!\nhi!\n, ");
    int var48 = var42.getAvaliacaoPositiva();
    var42.addConvenio("hi!, hi!\nhi!\n, ");
    var42.setTipo("");
    int var53 = var42.getAvaliacaoPositiva();
    java.lang.String var54 = var42.getEspecialidade();
    java.lang.String var55 = var42.getTipo();
    var42.setEspecialidade("");
    java.lang.String var58 = var42.getEspecialidade();
    boolean var59 = var5.equals((java.lang.Object)var42);
    java.lang.String var60 = var42.getNumeroRegistro();
    int var61 = var42.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + ""+ "'", var58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test7");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoNegativa();
    java.lang.String var17 = var5.getTipo();
    int var18 = var5.getAvaliacaoPositiva();
    model.ProfissionalSaude var24 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var28 = new model.Avaliacao("", "hi!", false);
    java.lang.String var29 = var28.getIdUsuario();
    var24.addAvaliacao(var28);
    var24.setNumeroRegistro("");
    java.lang.String var33 = var24.getNome();
    var24.setEspecialidade("hi!");
    boolean var36 = var5.equals((java.lang.Object)var24);
    java.lang.String var37 = var5.getEspecialidade();
    var5.setEspecialidade(", \nhi!\n, hi!");
    model.ProfissionalSaude var45 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var46 = var45.getNome();
    java.lang.String var47 = var45.getNumeroRegistro();
    java.lang.String var48 = var45.getTipo();
    java.lang.String var49 = var45.getTipo();
    int var50 = var45.getAvaliacaoNegativa();
    model.Avaliacao var54 = new model.Avaliacao("hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", true);
    java.lang.String var55 = var54.getCrm();
    java.lang.String var56 = var54.getCrm();
    var45.addAvaliacao(var54);
    boolean var58 = var5.equals((java.lang.Object)var45);
    java.lang.String var59 = var45.getEspecialidade();
    java.lang.String var60 = var45.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var37.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var60.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test8");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    java.lang.String var3 = var2.getIdentificacao();
    model.Endereco var10 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var11 = var10.getNumero();
    var10.setCidade("hi!");
    model.Endereco var20 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var22 = var20.equals((java.lang.Object)10L);
    java.lang.String var23 = var20.getNumero();
    boolean var24 = var10.equals((java.lang.Object)var23);
    var10.setBairro("");
    var10.setRua("");
    var10.setBairro("hi!, hi!\nhi!\n, ");
    java.lang.String var31 = var10.toString();
    var10.setEstado("hi!, \nhi!\n, hi!");
    java.lang.String var34 = var10.getBairro();
    var10.setSala("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    boolean var37 = var2.equals((java.lang.Object)var10);
    java.lang.String var38 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "+ "'", var3.equals("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ", hi!\nhi!, hi!\nhi!\n, \nhi!, "+ "'", var31.equals(", hi!\nhi!, hi!\nhi!\n, \nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var34.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var38.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test9");


    model.Usuario var2 = new model.Usuario("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    var2.setIdentificacao(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var11 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var11.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test10");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.Endereco var20 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var21 = var20.getEstado();
    boolean var22 = var6.equals((java.lang.Object)var21);
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var25 = var6.getEstado();
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    java.lang.String var30 = var6.getBairro();
    java.lang.String var31 = var6.toString();
    var6.setEstado("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var25.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , "+ "'", var31.equals("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , "));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test11");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    var19.setSala("hi!");
    boolean var27 = var5.equals((java.lang.Object)"hi!");
    var5.setTipo("hi!, hi!\nhi!\n, ");
    java.lang.String var30 = var5.getNome();
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setConvenio("hi!, \nhi!\n, hi!");
    model.ProfissionalSaude var40 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var41 = var40.getNome();
    var40.setEspecialidade("hi!, \nhi!\n, ");
    var40.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var46 = var40.getTipo();
    var40.setNumeroRegistro("hi!");
    var40.setRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var56 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var60 = new model.Avaliacao("", "hi!", false);
    java.lang.String var61 = var60.getIdUsuario();
    var56.addAvaliacao(var60);
    var56.setNumeroRegistro("");
    java.lang.String var65 = var56.getConvenio();
    model.Avaliacao var69 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var56.addAvaliacao(var69);
    boolean var71 = var69.isAvaliacao();
    var40.addAvaliacao(var69);
    var5.addAvaliacao(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var65.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test12");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test13");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    var2.setNome("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test14");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var16 = var5.getAvaliacaoPositiva();
    int var17 = var5.getAvaliacaoPositiva();
    java.lang.String var18 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test15");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.getRua();
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var6.setBairro(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var6.setBairro(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var21 = var6.toString();
    java.lang.String var22 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, "+ "'", var21.equals("hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, "+ "'", var22.equals("hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, "));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test16");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.Avaliacao var29 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", true);
    var5.addAvaliacao(var29);
    boolean var31 = var29.isAvaliacao();
    java.lang.String var32 = var29.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "+ "'", var32.equals("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test17");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setNumeroRegistro("hi!");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var21 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var22 = var21.getNome();
    var21.setEspecialidade("hi!, \nhi!\n, ");
    model.ProfissionalSaude var30 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var31 = var30.getNome();
    java.lang.String var32 = var30.getNumeroRegistro();
    int var33 = var30.getAvaliacaoPositiva();
    var30.setTipo("hi!, hi!\nhi!\n, ");
    int var36 = var30.getAvaliacaoPositiva();
    var30.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var39 = var30.getConvenio();
    boolean var40 = var21.equals((java.lang.Object)var30);
    var30.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var43 = var30.getEspecialidade();
    java.lang.String var44 = var30.getNome();
    var30.setTipo("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var52 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var53 = var52.getNome();
    java.lang.String var54 = var52.getNumeroRegistro();
    int var55 = var52.getAvaliacaoPositiva();
    var52.setTipo("hi!, hi!\nhi!\n, ");
    int var58 = var52.getAvaliacaoPositiva();
    var52.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var61 = var52.getNome();
    var52.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var52.setNome("hi!, hi!\n\n, ");
    model.Avaliacao var69 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", true);
    boolean var70 = var69.isAvaliacao();
    var52.addAvaliacao(var69);
    var30.addAvaliacao(var69);
    java.lang.String var73 = var69.getCrm();
    java.lang.String var74 = var69.getCrm();
    boolean var75 = var69.isAvaliacao();
    var5.addAvaliacao(var69);
    int var77 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var39.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!, \nhi!\n, "+ "'", var73.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "hi!, \nhi!\n, "+ "'", var74.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test18");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    model.Avaliacao var23 = new model.Avaliacao("", "hi!", false);
    java.lang.String var24 = var23.getIdUsuario();
    boolean var25 = var23.isAvaliacao();
    var8.addAvaliacao(var23);
    boolean var31 = var8.verificaParametros("", "hi!", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!");
    model.Usuario var34 = new model.Usuario("", "");
    java.lang.String var35 = var34.getIdentificacao();
    var34.setIdentificacao("hi!");
    java.lang.String var38 = var34.getNome();
    var34.setNome("hi!");
    model.ProfissionalSaude var46 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var50 = new model.Avaliacao("", "hi!", false);
    java.lang.String var51 = var50.getIdUsuario();
    var46.addAvaliacao(var50);
    java.lang.String var53 = var50.getIdUsuario();
    boolean var54 = var34.equals((java.lang.Object)var50);
    java.lang.String var55 = var50.getIdUsuario();
    boolean var56 = var50.isAvaliacao();
    java.lang.String var57 = var50.getIdUsuario();
    var8.addAvaliacao(var50);
    var8.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ");
    var8.setEspecialidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var8.setRegistro(", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!"+ "'", var57.equals("hi!"));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test19");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\nhi!, \nhi!");
    var6.setNumero("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test20");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getCidade();
    java.lang.String var11 = var6.getRua();
    model.ProfissionalSaude var17 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("", "hi!", false);
    java.lang.String var22 = var21.getIdUsuario();
    var17.addAvaliacao(var21);
    var17.setNumeroRegistro("");
    boolean var30 = var17.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var31 = var17.getAvaliacaoPositiva();
    var17.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var17.setTipo("hi!, hi!\nhi!\nhi!, \nhi!");
    int var36 = var17.getAvaliacaoNegativa();
    boolean var37 = var6.equals((java.lang.Object)var17);
    java.lang.String var38 = var6.getEstado();
    var6.setEstado("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test21");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var26 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var26.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test22");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getBairro();
    var6.setEstado("hi!, \nhi!\n, ");
    var6.setRua("");
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var23 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var25 = var23.equals((java.lang.Object)10L);
    var23.setCidade("");
    var23.setBairro("");
    java.lang.String var30 = var23.getNumero();
    boolean var31 = var6.equals((java.lang.Object)var23);
    var23.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test23");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    java.lang.String var11 = var5.getEspecialidade();
    java.lang.String var12 = var5.getConvenio();
    java.lang.String var13 = var5.getConvenio();
    var5.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var12.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var13.equals("hi!, hi!\nhi!\nhi!, \n"));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test24");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    java.lang.String var13 = var6.getNumero();
    java.lang.String var14 = var6.getSala();
    java.lang.String var15 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test25");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!\nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    int var19 = var5.getAvaliacaoNegativa();
    int var20 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test26");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ", "hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "");

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test27");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.getRua();
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var6.setBairro(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var6.setBairro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test28");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var5.addAvaliacao(var21);
    var5.addConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Endereco var31 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var32 = var31.getNumero();
    model.Endereco var39 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var40 = var39.getNumero();
    var39.setCidade("hi!");
    model.Endereco var49 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var51 = var49.equals((java.lang.Object)10L);
    java.lang.String var52 = var49.getNumero();
    boolean var53 = var39.equals((java.lang.Object)var52);
    var39.setBairro("");
    java.lang.String var56 = var39.getBairro();
    var39.setNumero("hi!, hi!\nhi!\n, ");
    boolean var59 = var31.equals((java.lang.Object)var39);
    java.lang.String var60 = var31.getNumero();
    var31.setRua("hi!, \nhi!\n, ");
    var31.setSala("hi!, hi!\nhi!\nhi!, \nhi!");
    model.Avaliacao var68 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var69 = var68.getCrm();
    java.lang.String var70 = var68.getCrm();
    java.lang.String var71 = var68.getIdUsuario();
    boolean var72 = var31.equals((java.lang.Object)var68);
    java.lang.String var73 = var68.getCrm();
    var5.addAvaliacao(var68);
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    int var77 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    int var80 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!, \nhi!\n, "+ "'", var69.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "hi!, \nhi!\n, "+ "'", var70.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var71.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!, \nhi!\n, "+ "'", var73.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 1);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test29");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getIdentificacao();
    java.lang.String var4 = var2.getNome();
    model.Endereco var11 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!\n", "hi!, hi!\nhi!\nhi!, ");
    boolean var12 = var2.equals((java.lang.Object)"hi!, hi!\n\n, ");
    java.lang.String var13 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var3.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, \nhi!\n, "+ "'", var4.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, hi!\nhi!\n, "));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test30");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNumeroRegistro();
    int var13 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test31");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    java.lang.String var23 = var6.getBairro();
    var6.setNumero("hi!, hi!\nhi!\n, ");
    java.lang.String var26 = var6.getRua();
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!");
    java.lang.String var29 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test32");


    model.Endereco var6 = new model.Endereco("", "", "hi!", "", "", "hi!");
    java.lang.String var7 = var6.getEstado();
    java.lang.String var8 = var6.getBairro();
    var6.setEstado("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test33");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setTipo("");
    int var16 = var5.getAvaliacaoNegativa();
    var5.setTipo("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    model.ProfissionalSaude var24 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var28 = new model.Avaliacao("", "hi!", false);
    java.lang.String var29 = var28.getIdUsuario();
    var24.addAvaliacao(var28);
    int var31 = var24.getAvaliacaoPositiva();
    var24.addConvenio("hi!, hi!\nhi!\nhi!, ");
    int var34 = var24.getAvaliacaoNegativa();
    model.Avaliacao var38 = new model.Avaliacao("hi!", "", true);
    var24.addAvaliacao(var38);
    var5.addAvaliacao(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test34");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    model.Endereco var14 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var15 = var14.getNumero();
    var14.setCidade("hi!");
    model.Endereco var24 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var26 = var24.equals((java.lang.Object)10L);
    java.lang.String var27 = var24.getNumero();
    boolean var28 = var14.equals((java.lang.Object)var27);
    var14.setBairro("");
    java.lang.String var31 = var14.getBairro();
    var14.setNumero("hi!, hi!\nhi!\n, ");
    boolean var34 = var6.equals((java.lang.Object)var14);
    model.ProfissionalSaude var40 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var44 = new model.Avaliacao("", "hi!", false);
    java.lang.String var45 = var44.getIdUsuario();
    var40.addAvaliacao(var44);
    int var47 = var40.getAvaliacaoPositiva();
    java.lang.String var48 = var40.getEspecialidade();
    model.ProfissionalSaude var54 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var55 = var54.getNome();
    java.lang.String var56 = var54.getNumeroRegistro();
    int var57 = var54.getAvaliacaoPositiva();
    var54.setTipo("hi!, hi!\nhi!\n, ");
    int var60 = var54.getAvaliacaoPositiva();
    var54.addConvenio("hi!, hi!\nhi!\n, ");
    int var63 = var54.getAvaliacaoPositiva();
    boolean var68 = var54.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var54.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var54.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var54.setNome("hi!, \nhi!\n, ");
    boolean var75 = var40.equals((java.lang.Object)var54);
    boolean var76 = var6.equals((java.lang.Object)var40);
    var6.setCidade("hi!, hi!\n\nhi!, ");
    var6.setEstado("hi!, hi!\n\n, , \nhi!\n, ");
    java.lang.String var81 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var81.equals("hi!, hi!\n\nhi!, "));

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test35");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setSala("hi!");
    java.lang.String var10 = var6.getRua();
    java.lang.String var11 = var6.toString();
    model.Endereco var18 = new model.Endereco("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var19 = var6.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!\n\nhi!, ");
    java.lang.String var22 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var11.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test36");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!");
    model.Usuario var17 = new model.Usuario("hi!, \nhi!\n, ", "hi!");
    boolean var18 = var5.equals((java.lang.Object)var17);
    int var19 = var5.getAvaliacaoNegativa();
    java.lang.String var20 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var20.equals("hi!, hi!\nhi!\nhi!, \nhi!"));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test37");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test38");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    var5.addConvenio("hi!, hi!\n\nhi!, \nhi!\n, , hi!");

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test39");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setSala("hi!");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getEstado();
    java.lang.String var17 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\n\n, "+ "'", var15.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test40");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, hi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test41");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    int var13 = var5.getAvaliacaoPositiva();
    model.Endereco var20 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var21 = var20.getNumero();
    model.Endereco var28 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var29 = var28.getNumero();
    var28.setCidade("hi!");
    model.Endereco var38 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var40 = var38.equals((java.lang.Object)10L);
    java.lang.String var41 = var38.getNumero();
    boolean var42 = var28.equals((java.lang.Object)var41);
    var28.setBairro("");
    java.lang.String var45 = var28.getBairro();
    var28.setNumero("hi!, hi!\nhi!\n, ");
    boolean var48 = var20.equals((java.lang.Object)var28);
    boolean var49 = var5.equals((java.lang.Object)var28);
    var28.setNumero("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Usuario var54 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    boolean var55 = var28.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test42");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", false);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test43");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    var19.setSala("hi!");
    boolean var27 = var5.equals((java.lang.Object)"hi!");
    java.lang.String var28 = var5.getTipo();
    var5.setRegistro("hi!, hi!\n\n, ");
    var5.setTipo(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    model.ProfissionalSaude var38 = new model.ProfissionalSaude(", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var38.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var41 = var38.getConvenio();
    var38.setRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var38.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.Avaliacao var49 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", false);
    var38.addAvaliacao(var49);
    var38.setEspecialidade("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    var38.setConvenio("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    boolean var55 = var5.equals((java.lang.Object)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var28.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var41.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test44");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    model.Endereco var17 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var18 = var17.getNumero();
    model.Endereco var25 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var26 = var25.getNumero();
    var25.setCidade("hi!");
    model.Endereco var35 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var37 = var35.equals((java.lang.Object)10L);
    java.lang.String var38 = var35.getNumero();
    boolean var39 = var25.equals((java.lang.Object)var38);
    var25.setBairro("");
    java.lang.String var42 = var25.getBairro();
    var25.setNumero("hi!, hi!\nhi!\n, ");
    boolean var45 = var17.equals((java.lang.Object)var25);
    var25.setBairro("");
    boolean var48 = var6.equals((java.lang.Object)var25);
    var25.setSala("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var51 = var25.getNumero();
    java.lang.String var52 = var25.getNumero();
    var25.setBairro("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var51.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var52.equals("hi!, hi!\nhi!\n, "));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test45");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test46");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    model.Endereco var14 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var15 = var14.getNumero();
    var14.setCidade("hi!");
    model.Endereco var24 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var26 = var24.equals((java.lang.Object)10L);
    java.lang.String var27 = var24.getNumero();
    boolean var28 = var14.equals((java.lang.Object)var27);
    var14.setBairro("");
    java.lang.String var31 = var14.getBairro();
    var14.setNumero("hi!, hi!\nhi!\n, ");
    boolean var34 = var6.equals((java.lang.Object)var14);
    var14.setBairro("");
    java.lang.String var37 = var14.getBairro();
    model.ProfissionalSaude var43 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var47 = new model.Avaliacao("", "hi!", false);
    java.lang.String var48 = var47.getIdUsuario();
    var43.addAvaliacao(var47);
    var43.setRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var57 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var61 = new model.Avaliacao("", "hi!", false);
    java.lang.String var62 = var61.getIdUsuario();
    var57.addAvaliacao(var61);
    java.lang.String var64 = var57.getConvenio();
    boolean var65 = var43.equals((java.lang.Object)var57);
    boolean var66 = var14.equals((java.lang.Object)var43);
    model.Avaliacao var70 = new model.Avaliacao("", "hi!, \nhi!\n, ", true);
    java.lang.String var71 = var70.getIdUsuario();
    var43.addAvaliacao(var70);
    var43.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!"+ "'", var62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var64.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!, \nhi!\n, "+ "'", var71.equals("hi!, \nhi!\n, "));

  }

}
