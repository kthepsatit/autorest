namespace Fixtures.SwaggerBatBodyComplex.Models
{
    using System;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// </summary>
    public partial class ByteWrapper
    {
        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "field")]
        public byte[] Field { get; set; }

    }
}