package AboutMe;

/* 
 * void saveNetDevices() {
  try {
    FileOutputStream fos = new
    FileOutputStream("NetDevices.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(mNetDevices);
    oos.close();
    fos.close();
  } catch (NullPointerException nexc) {
    JOptionPane.showMessageDialog(null, "NetDevices list is null - No devices saved", "Saving NetDevices", JOptionPane.INFORMATION_MESSAGE);
  } catch (InvalidClassException nexc) {
    JOptionPane.showMessageDialog(null, "NetDevices list is invalid - No devices saved", "Saving NetDevices", JOptionPane.INFORMATION_MESSAGE);
  } catch (NotSerializableException nexc) {
    JOptionPane.showMessageDialog(null, "NetDevices list is not serializable - No devices saved", "Saving NetDevices", JOptionPane.INFORMATION_MESSAGE);
  } catch (IOException nexc) {
    JOptionPane.showMessageDialog(null, "IO Exception saving NetDevices list - No devices saved", "Saving NetDevices", JOptionPane.INFORMATION_MESSAGE);
  }
}



 
 Throws Voc� est� lan�ando uma exce��o, exemplo:

 public void acordar() throws Exception {
    throw new Exception("opa, deu erro");
 }
 
  
 Use throw para lan�ar uma exce��o nesse caso:

 if (numero < 0) {
  throw new Exception("N�mero n�o pode ser menor que zero!");
 }
  
  
  
  
  
 A declara��o throws � usado em um m�todo para indicar que ele lan�a uma determinada Exce��o:

 public void fazAlgo(int numero) throws Exception {
  if (numero < 0) {
    throw new Exception("N�mero n�o pode ser menor que zero!");
  }
  
 }
  
  
  
  //� claro que o recomendado � criar suas pr�prias Exce��es:

 class NumeroMenorQueZeroException extends Exception {

 }
 
  
  
  
  
  
  //Assim a declara��o ficaria desse jeito:

 class MinhaClasse {

  // o "throws" no m�todo abaixo indica que ele lan�a
  // a exce��o "NumeroMenorQueZeroException", que criamos acima

  public void fazAlgo(int numero) throws NumeroMenorQueZeroException {
    if (numero < 0) {
      throw NumeroMenorQueZeroException("Numero n�o pode ser menor que zero!");
    } else {
      // faz algo com o n�mero maior ou igual a zero
    }
  }

}

*/

