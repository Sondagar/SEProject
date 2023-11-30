public class SelfDrivingCar {

	private Sensor sensors;
	private ControlUnit controlUnit;
	private NavigationSystem navigationSystem;
	private CommunicationModule communicationModule;
	private DriveSystem driveSystem;

	public Sensor getSensors() {
		return this.sensors;
	}

	public void setSensors(Sensor sensors) {
		this.sensors = sensors;
	}

	public ControlUnit getControlUnit() {
		return this.controlUnit;
	}

	public void setControlUnit(ControlUnit controlUnit) {
		this.controlUnit = controlUnit;
	}

	public NavigationSystem getNavigationSystem() {
		return this.navigationSystem;
	}

	public void setNavigationSystem(NavigationSystem navigationSystem) {
		this.navigationSystem = navigationSystem;
	}

	public CommunicationModule getCommunicationModule() {
		return this.communicationModule;
	}

	public void setCommunicationModule(CommunicationModule communicationModule) {
		this.communicationModule = communicationModule;
	}

	public DriveSystem getDriveSystem() {
		return this.driveSystem;
	}

	public void setDriveSystem(DriveSystem driveSystem) {
		this.driveSystem = driveSystem;
	}

	public void start() {
		// TODO - implement SelfDrivingCar.start
		throw new UnsupportedOperationException();
	}

	public void stop() {
		// TODO - implement SelfDrivingCar.stop
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param destination
	 */
	public void navigateTo(Location destination) {
		// TODO - implement SelfDrivingCar.navigateTo
		throw new UnsupportedOperationException();
	}

	public void updatedSensors() {
		// TODO - implement SelfDrivingCar.updatedSensors
		throw new UnsupportedOperationException();
	}

	public void processSensorData() {
		// TODO - implement SelfDrivingCar.processSensorData
		throw new UnsupportedOperationException();
	}

	public void makeDecision() {
		// TODO - implement SelfDrivingCar.makeDecision
		throw new UnsupportedOperationException();
	}

	public void communicateWithCentralSystem() {
		// TODO - implement SelfDrivingCar.communicateWithCentralSystem
		throw new UnsupportedOperationException();
	}

	public void executeDriveCommand() {
		// TODO - implement SelfDrivingCar.executeDriveCommand
		throw new UnsupportedOperationException();
	}

}