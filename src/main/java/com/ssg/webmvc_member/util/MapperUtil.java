package com.ssg.webmvc_member.util;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;

public enum MapperUtil {
    // object mapping 서로 다른 클래스의 값을 한번에 복사하게 도와주는 라이브러리
    INSTANCE;

    private ModelMapper modelMapper;

    MapperUtil(){
        this.modelMapper = new ModelMapper();
        this.modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies.STRICT);
    }
    public  ModelMapper get(){
        return modelMapper;
    }

//    ModelMapper는 Java 객체 간의 매핑을 용이하게 하는 라이브러리입니다.
//    즉, 하나의 객체의 데이터를 다른 객체의 데이터로 자동으로 복사하는 것을 도와줍니다.
//    이것은 DTO(Data Transfer Object) 패턴에서 매우 유용합니다.
//    객체의 필드나 프로퍼티가 다른 객체의 필드나 프로퍼티와 이름이나 타입이 일치할 때,
//    ModelMapper는 자동으로 데이터를 할당(매핑)할 수 있습니다.

//    vo-> db 의 테이블의 칼럼의 값을 도메인 맞게 저장, getter 로만 호출가능
//    dto -> dao 레이어의 vo 에서 비즈니스계층의 model 로 원하는 데이터만 전송,
//    비즈니스계층에서 표현계층으로 전달에서도 사용
//
//    ModelMapper에서 설정하는 몇 가지 옵션들은 다음과 같습니다:
//
//    setFieldMatchingEnabled(true): 이 설정은 ModelMapper가 객체 간 매핑을 할 때 필드
//    이름이 같은 필드들끼리 매핑을 수행하도록 합니다. 즉, 게터(getter)와 세터(setter) 메소드를 사용하지 않고
//    직접 필드에 접근하여 값을 할당합니다.
//
//    setFieldAccessLevel(Configuration.AccessLevel.PRIVATE): 이 설정은 ModelMapper가
//    private 접근 제한자를 가진 필드에도 접근할 수 있도록 허용합니다.기본적으로 ModelMapper는
//        public 또는 protected 필드만 접근할 수 있지만, 이 설정을 통해 private 필드에도
//    접근이 가능해집니다.
//
//            setMatchingStrategy(MatchingStrategies.STRICT): 매핑 전략을 설정하는 부분으로,
//    STRICT 전략을 사용하면 매핑 과정에서 소스와 목적지 객체 간의 필드 이름이 정확히 일치해야 합니다.
//    이는 느슨한 매핑(LOOSE 전략)과 대조되는데, 느슨한 매핑은 이름이 유사하기만 해도 매핑을 수행합니다.
//    STRICT 전략을 사용하면 데이터의 정확한 매핑이 보장됩니다.
//
//    예를 들어, Source 객체에 firstName이라는 필드가 있고, Destination 객체에도 firstName이라는
//    필드가 있을 때, STRICT 매칭 전략을 사용하면 ModelMapper는 이 두 필드를 매핑합니다.
//    만약 필드 이름이 약간 다르면 (예: first_name과 firstName), STRICT 전략에서는 매핑하지 않을 것입니다.



}
