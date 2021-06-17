/**
 * ocr.js
 */
 
 $(function(){
	$('#ocrForm').on('submit', function(event){
		event.preventDefault(); //submit 후에  reload 안 되게
		var formData = new FormData($('#ocrForm')[0]);
	setTimeout( function() {		   
	 $('#ocrImg').prop("src", 'http://49.50.165.28:8080/fileupload/'+ src);
		} , 1000) ;
		$.ajax({
			type:"post",
			enctype:"multipart/form-data",
			url:"OcrResult",
			data:formData,
			processData:false, //필수
			contentType:false, //필수
			success:function(result){
				$('#ocr_text').text(result);
			},
			error:function(e){
				alert("에러 발생 : " + e);
			}			
		});
	});
	
});