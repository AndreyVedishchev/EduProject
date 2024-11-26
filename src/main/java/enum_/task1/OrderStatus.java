package enum_.task1;

public enum OrderStatus {
    NEW {
        @Override
        public boolean canTransitionTo(OrderStatus newState) {
            return newState == PROCESSING || newState == CANCELLED;
        }
    },
    PROCESSING {
        @Override
        public boolean canTransitionTo(OrderStatus newState) {
            return newState == SHIPPED || newState == CANCELLED;
        }
    },
    SHIPPED {
        @Override
        public boolean canTransitionTo(OrderStatus newState) {
            return newState == DELIVERED;
        }
    },
    DELIVERED {
        @Override
        public boolean canTransitionTo(OrderStatus newState) {
            return false; // Конечное состояние
        }
    },
    CANCELLED {
        @Override
        public boolean canTransitionTo(OrderStatus newState) {
            return false; // Конечное состояние
        }
    };

    public abstract boolean canTransitionTo(OrderStatus newState);

    public void validateTransition(OrderStatus newState) {
        if (!canTransitionTo(newState)) {
            throw new IllegalStateException(
                    "Cannot transition from " + this + " to " + newState
            );
        }
    }
}
