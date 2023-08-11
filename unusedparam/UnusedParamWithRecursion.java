package unusedparam;

public class UnusedParamWithRecursion {

  public final String completely_unused_param(String p1, String p2) {
    return p1;
  }

  public final String param_only_used_in_recursion(String p1, String p2) {
    if (!p1.isEmpty()) {
      return param_only_used_in_recursion(p1.substring(1), p2);
    }
    return p1;
  }


  /* 2 methods calling each other */

  public final String f1(String p1, String p2) {
    return f2(p1, p2);
  }

  public final String f2(String p1, String p2) {
    if (!p1.isEmpty()) {
      return f1(p1.substring(1), p2);
    }
    return p1;
  }

}
