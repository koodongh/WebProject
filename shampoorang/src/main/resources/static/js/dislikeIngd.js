function getValue() {
	const ingd = document.getElementsByName("ingd");
	let i = 0;
	
	for (i; i < ingd.length; i++) {
		if (ingd[i].checked == true) {
			alert(ingd[i].value);
		}
	}
}