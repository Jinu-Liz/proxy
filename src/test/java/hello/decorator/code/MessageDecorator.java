package hello.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageDecorator implements Component {

  private Component component;

  public MessageDecorator(Component component) {
    this.component = component;
  }

  @Override
  public String operation() {
    log.info("MessageDecorator 실행");

    // data -> ***** data *****
    String reslut = component.operation();
    String decoResult = "***** " + reslut + " *****";
    log.info("MessageDecorator 꾸미기 적용 전={}, 적용 후={}", reslut, decoResult);
    return decoResult;
  }
}
