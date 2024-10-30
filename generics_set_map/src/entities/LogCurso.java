package entities;

import java.util.Date;
import java.util.Objects;

public class LogCurso {

	private String codigo;
	private Date moment;
	
	public LogCurso(String codigo, Date moment) {
		this.codigo = codigo;
		this.moment = moment;
	}

	public String getcodigo() {
		return codigo;
	}

	public void setcodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo, moment);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogCurso other = (LogCurso) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(moment, other.moment);
	}
	
	
}
