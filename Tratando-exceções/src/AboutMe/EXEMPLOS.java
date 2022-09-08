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



 
 Throws Você está lançando uma exceção, exemplo:

 public void acordar() throws Exception {
    throw new Exception("opa, deu erro");
 }
 
  
 Use throw para lançar uma exceção nesse caso:

 if (numero < 0) {
  throw new Exception("Número não pode ser menor que zero!");
 }
  
  
  
  
  
 A declaração throws é usado em um método para indicar que ele lança uma determinada Exceção:

 public void fazAlgo(int numero) throws Exception {
  if (numero < 0) {
    throw new Exception("Número não pode ser menor que zero!");
  }
  
 }
  
  
  
  //É claro que o recomendado é criar suas próprias Exceções:

 class NumeroMenorQueZeroException extends Exception {

 }
 
  
  
  
  
  
  //Assim a declaração ficaria desse jeito:

 class MinhaClasse {

  // o "throws" no método abaixo indica que ele lança
  // a exceção "NumeroMenorQueZeroException", que criamos acima

  public void fazAlgo(int numero) throws NumeroMenorQueZeroException {
    if (numero < 0) {
      throw NumeroMenorQueZeroException("Numero não pode ser menor que zero!");
    } else {
      // faz algo com o número maior ou igual a zero
    }
  }

}

*/

