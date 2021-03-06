 package ojvm.loading.instructions;
                         
import ojvm.util.RuntimeConstants;

/**
 * The encapsulation of an astore_0 instruction. 
 * @author Amr Sabry
 * @version jdk-1.1
 */

public class Ins_astore_0 extends Ins_astore {

  public Ins_astore_0 (InstructionInputStream classFile) {
    super(RuntimeConstants.opc_astore_0, 0);
  }

  public String toString () {
    return opcodeName;
  }
}
