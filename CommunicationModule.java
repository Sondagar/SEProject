public class CommunicationModule {

	private String connectionType;
	private int dataTransferRate;

	public String getConnectionType() {
		return this.connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public int getDataTransferRate() {
		return this.dataTransferRate;
	}

	public void setDataTransferRate(int dataTransferRate) {
		this.dataTransferRate = dataTransferRate;
	}

	public void sendData() {
		// TODO - implement CommunicationModule.sendData
		throw new UnsupportedOperationException();
	}

	public void receivedata() {
		// TODO - implement CommunicationModule.receivedata
		throw new UnsupportedOperationException();
	}

}