package sorra.tracesonar.sample;

public class SuperClass implements Interface {
  @Override
  public Object does() {
    return null;
  }

  private void call() {
    ((Interface)this).does();
  }
}
