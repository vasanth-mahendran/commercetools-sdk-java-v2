package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.state.StateReference;
import com.commercetools.models.message.OrderStateTransitionMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderStateTransitionMessagePayloadBuilder {
   
   
   private Boolean force;
   
   
   private com.commercetools.models.state.StateReference state;
   
   public OrderStateTransitionMessagePayloadBuilder force( final Boolean force) {
      this.force = force;
      return this;
   }
   
   public OrderStateTransitionMessagePayloadBuilder state( final com.commercetools.models.state.StateReference state) {
      this.state = state;
      return this;
   }
   
   
   public Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.state.StateReference getState(){
      return this.state;
   }

   public OrderStateTransitionMessagePayload build() {
       return new OrderStateTransitionMessagePayloadImpl(force, state);
   }
   
   public static OrderStateTransitionMessagePayloadBuilder of() {
      return new OrderStateTransitionMessagePayloadBuilder();
   }
   
   public static OrderStateTransitionMessagePayloadBuilder of(final OrderStateTransitionMessagePayload template) {
      OrderStateTransitionMessagePayloadBuilder builder = new OrderStateTransitionMessagePayloadBuilder();
      builder.force = template.getForce();
      builder.state = template.getState();
      return builder;
   }
   
}