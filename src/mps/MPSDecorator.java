package mps;

public abstract class MPSDecorator implements ParliamentManagementSystem {

    protected ParliamentManagementSystem decoratedParliamentManagementSystem;


    public MPSDecorator(ParliamentManagementSystem decoratedParliamentManagementSystem) {
        super();
        this.decoratedParliamentManagementSystem = decoratedParliamentManagementSystem;
    }
}
