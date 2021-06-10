/**
 * 
 */
 

var sa = {
    init : function () {
        var _this = this;
        $('#save-ana').on('click', function () {
            _this.save();
        });
    },
    save : function () {
        var data = {
            resultDiv: $('#resultDiv').val()
        };
 
        $.ajax({
            type: 'POST',
            url: 'SAVEANA',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('분석이 완료되었습니다');
            location.reload();
        }).fail(function (error) {
            alert(error);
        });
    }
};

sa.init();