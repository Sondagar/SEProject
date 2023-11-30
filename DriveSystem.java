public class DriveSystem {

	private MotorController motorcontroller;
	private BrakeController brakeController;
	private SteeringController steeringController;

	public MotorController getMotorcontroller() {
		return this.motorcontroller;
	}

	public void setMotorcontroller(MotorController motorcontroller) {
		this.motorcontroller = motorcontroller;
	}

	public BrakeController getBrakeController() {
		return this.brakeController;
	}

	public void setBrakeController(BrakeController brakeController) {
		this.brakeController = brakeController;
	}

	public SteeringController getSteeringController() {
		return this.steeringController;
	}

	public void setSteeringController(SteeringController steeringController) {
		this.steeringController = steeringController;
	}

	/**
	 * 
	 * @param speed
	 */
	public void accelerate(float speed) {
		// TODO - implement DriveSystem.accelerate
		throw new UnsupportedOperationException();
	}

	public void brake() {
		// TODO - implement DriveSystem.brake
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param angle
	 */
	public void steer(float angle) {
		// TODO - implement DriveSystem.steer
		throw new UnsupportedOperationException();
	}

}