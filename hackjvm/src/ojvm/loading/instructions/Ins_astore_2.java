 package ojvm.loading.instructions;
                         
import ojvm.util.RuntimeConstants;

/**
 * The encapsulation of an astore_2 instruction. 
 * @author Amr Sabry
 * @version jdk-1.1
 */

public class Ins_astore_2 extends Ins_astore {
  public Ins_astore_2 (InstructionInputStream classFile) {
    super(RuntimeConstants.opc_astore_2, 2);
  }

  public String toString () {
    return opcodeName;
  }
}
