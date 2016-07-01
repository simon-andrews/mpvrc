package org.simonandrews.mpvrc;

public class WebUi {
    public static String uiHtml = "\n" +
            "<html>\n" +
            "<head>\n" +
            "    <title>mpvrc</title>\n" +
            "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\n" +
            "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\" integrity=\"sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r\" crossorigin=\"anonymous\">\n" +
            "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\">\n" +
            "    <script>\n" +
            "        function get(url) {\n" +
            "            var xmlHttp = new XMLHttpRequest();\n" +
            "            xmlHttp.open(\"GET\", url, false);\n" +
            "            xmlHttp.send(null);\n" +
            "        }\n" +
            "    </script>\n" +
            "</head>\n" +
            "<body>\n" +
            "    <nav class=\"navbar navbar-default navbar-static-top\">\n" +
            "        <div class=\"navbar-header\">\n" +
            "            <a class=\"navbar-brand\" href=\"#\">mpvrc</a>\n" +
            "        </div>\n" +
            "    </nav>\n" +
            "    <div style=\"\">\n" +
            "        <div class=\"row\">\n" +
            "            <div class=\"panel panel-default\">\n" +
            "                <div class=\"panel-body\">\n" +
            "                    <div class=\"col-sm-3\"><button class=\"btn btn-primary btn-lg btn-block\" role=\"button\" onclick=\"get('/seekBackward60')\"><i class=\"fa fa-fast-backward\" aria-hidden=\"true\"></i></a></div>\n" +
            "                    <div class=\"col-sm-3\"><button class=\"btn btn-primary btn-lg btn-block\" role=\"button\" onclick=\"get('/seekBackward5')\"><i class=\"fa fa-step-backward\" aria-hidden=\"true\"></i></a></div>\n" +
            "                    <div class=\"col-sm-3\"><button class=\"btn btn-primary btn-lg btn-block\" role=\"button\" onclick=\"get('/seekForward5')\"><i class=\"fa fa-step-forward\" aria-hidden=\"true\"></i></a></div>\n" +
            "                    <div class=\"col-sm-3\"><button class=\"btn btn-primary btn-lg btn-block\" role=\"button\" onclick=\"get('/seekForward60')\"><i class=\"fa fa-fast-forward\" aria-hidden=\"true\"></i></a></div>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div class=\"row\">\n" +
            "            <div class=\"panel panel-default\">\n" +
            "                <div class=\"panel-body\">\n" +
            "                    <div class=\"col-sm-12\"><button class=\"btn btn-primary btn-lg btn-block\" role=\"button\" onclick=\"get('/togglePlayback')\"><i class=\"fa fa-pause\" aria-hidden=\"true\"></i></a></div>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</body>\n" +
            "</html>\n";
}
