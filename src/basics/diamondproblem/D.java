package basics.diamondproblem;

public class D implements B /*, C*/ {

    // we get compilation error if we try to implement both B anc C, because in that case
    // compiler will not know which default method implementation of m() to invoke
}
