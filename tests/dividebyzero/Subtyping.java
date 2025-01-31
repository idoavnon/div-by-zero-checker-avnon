import org.checkerframework.checker.dividebyzero.qual.*;

// Test subtyping relationships for the Divide By Zero Checker.
// The file contains "// ::" comments to indicate expected errors and warnings.

class SubtypeTest {
  /// You will want a test like this for every pair of qualifiers in your type hierarchy.
  // void oneSubtypingRelationship(@MyTopQualifier int x, @MyBottomQualifier int y) {
  //   @MyTopQualifier int a = x;
  //   @MyTopQualifier int b = y;
  //   // :: error: assignment
  //   @MyBottomQualifier int c = x; // expected error on this line, as indicated just above
  //   @MyBottomQualifier int d = y;
  // }
 void bottomSubType(@Errorable int x) {
    @Errorable int a = x;
    // :: error: assignment
    @Zero int b = x;
    // :: error: assignment
    @NonZero int c = x;
    // :: error: assignment
    @Zeroable int d = x;
  }

  void topSubType(@Zeroable int x) {
    @Errorable int a = x;
    @Zero int b = x;
    @NonZero int c = x;
    @Zeroable int d = x;
  }

  void zeroSubType(@Zero int x) {
    @Errorable int a = x;
    @Zero int b = x;
    // :: error: assignment
    @NonZero int c = x;
    // :: error: assignment
    @Zeroable int d = x;
  }

  void nonZeroSubType(@NonZero int x) {
    @Errorable int a = x;
    // :: error: assignment
    @Zero int b = x;
    @NonZero int c = x;
    // :: error: assignment
    @Zeroable int d = x;
  }
}
